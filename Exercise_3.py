class ListNode:
    """
    A node in a singly-linked list.
    """
    def __init__(self, data=None, next=None):
        self.data = data
        self.next = next
    
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
        if not self.head:
            self.head= ListNode(data)
            return

        iter = self.head
        while iter.next is not None:
            iter = iter.next
        
        iter.next = ListNode(data)
        return
        
        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        if not self.head:
            return None
        iter = self.head
        while iter and iter.data != key:
            iter = iter.next
        if iter and iter.data == key:
            return iter
        return None

        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        if not self.head:
            return 
        if self.head.data == key:
            self.head = self.head.next
            return 
        
        iter = self.head
        while iter.next and iter.next.data != key:
            iter = iter.next
        
        if iter.next and iter.next.data == key:
            iter.next = iter.next.next 
        
        return
