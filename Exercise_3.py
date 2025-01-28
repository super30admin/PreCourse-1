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
        if not self.head:
            self.head = ListNode(data)
            return
        
        prev, curr = None, self.head
        while curr:
            prev = curr
            curr = curr.next
        prev.next = ListNode(data)
        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        curr = self.head
        while curr:
            if curr.val == key:
                return curr
            curr = curr.next
        
        return None
        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        prev, curr = None, self.head
        while curr:
            if curr.val == key:
                if not prev:
                    self.head = self.head.next
                else:
                    prev.next = curr.next
                return
            prev = curr
            curr = curr.next
