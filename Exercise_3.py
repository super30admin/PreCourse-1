#Time Complexity = 0(n). Since it ran whole list
# Space Complexity = O(1)
#  

class ListNode:
    """
    A node in a singly-linked list.
    """
    def __init__(self, data=None, next=None):
        self.data = data
        self.next = next
    
class SinglyLinkedList:
    def __init__(self):
        self.head = None
        """
        Create a new singly-linked list.
        Takes O(1) time.
        """
        self.head = None

    def append(self, data): 
        while head:
            start = self.head
            if self.start.next == None:
                self.start.next = data
            else:
                head = head.next 
        """
        Insert a new element at the end of the list.
        Takes O(n) time.
        """
        
    def find(self, key):
        while head:
            if head.val == key:
                return head.val
            else:
                head = head.next
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        
    def remove(self, key):
        while head:
            if head.next == key:
                head.next = head.next.next
            head = head.next
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
