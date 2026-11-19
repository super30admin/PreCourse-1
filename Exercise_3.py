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
        new_node = ListNode(data)
        if self.head is None:
            self.head = new_node
            return 
        curr = self.head
        while curr.next:
            curr = curr.next
        curr.next = new_node
        
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
        prev = None
        curr = self.head
        while curr:
            if curr.data == key:
                if prev is None:
                    self.head = curr.next

                else:
                    prev.next = curr.next 
                return 
            prev = curr
            curr = curr.next 


def print_list(lst):
    values = []
    curr = lst.head
    while curr:
        values.append(curr.data)
        curr = curr.next
    print(values)

lst = SinglyLinkedList()
for x in [1, 2, 3, 2]:
    lst.append(x)
print_list(lst)
print(lst.find(3).data)
print(lst.find(9))
lst.remove(1)
print_list(lst)
lst.remove(2)
print_list(lst)
lst.remove(9)
print_list(lst)
        