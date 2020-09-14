class ListNode:
    """
    A node in a singly-linked list.
    """
    def __init__(self, data=None, next=None):
        self.data = data
        self.next=None
    
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
        if self.head is None:
            self.head = ListNode(data)
        else:
            current = self.head
            while current.next!=None:
                current=current.next
            new_node = ListNode(data)
            current.next = new_node
            new_node.next=None

    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        current = self.head
        while(current.next!=None):
            if current.data==key:
                return current
            current = current.next
        return None
        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        temp = self.head
        if key == self.head.data:
            self.head=self.head.next
            temp = None
            return
        while(temp is not None):
            if temp.data == key:
                break
            prev = temp
            temp = temp.next
        if temp is None:
            return
        prev.next = temp.next
        temp=None

    def print_list(self):
        ptr = self.head
        while(ptr):
            print(ptr.data)
            ptr=ptr.next

my_list = SinglyLinkedList()
my_list.append(5)
my_list.append(10)
my_list.append(23)
my_list.append(25)
my_list.remove(25)
my_list.print_list()




