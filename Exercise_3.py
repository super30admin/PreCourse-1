class ListNode:
    """
    A node in a singly-linked list.
    """
    def __init__(self, data=None, next=None):
    
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
        
        current = self.head
        while current.next is not None:
            current = current.next
        
        current.next = new_node

        
        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        current = self.head

        while current.next is not None:
            if current.data == key:
                return True
            current = current.next

        return False        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        prev = None
        current = self.head

        if current is not None and current.data == key:
            self.head = current.next
            return 

        while current is not None:
            if current.data == key:
                prev.next = current.next
                return
            else:
                prev = current
                current = current.next

