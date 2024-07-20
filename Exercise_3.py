class ListNode:
    """
    A node in a singly-linked list.
    """
    def __init__(self, data=None, next=None):
        self.data = data
        self.next = None
    
class SinglyLinkedList:
    def __init__(self):
        """
        Create a new singly-linked list.
        Takes O(1) time.
        """
        self.head = None

    def append(self, data):
        """
        Insert a new element at the end of the list.
        Takes O(n) time.
        """
        new = ListNode(data)
        if not self.head:
            self.head = new
            return
        curr = self.head
        while curr.next:
            curr = curr.next
        curr.next = new



        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        curr = self.head
        while curr:
            if curr.data == key:
                return curr
            curr = curr.next
        return None
    
        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        if self.head.data == key:
            self.head = self.head.next
            return
        curr = self.head
        while curr.next:
            if curr.next.data == key:
                curr.next = curr.next.next
                return
            curr = curr.next

my_list = SinglyLinkedList()

# Append some elements
my_list.append(10)
my_list.append(20)
my_list.append(30)
my_list.append(40)

found_node = my_list.find(80)
if found_node:
    print(f"Found: {found_node.data}")