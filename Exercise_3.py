# Time Complexity : O(n) for append, find, remove
# Space omplexity : O(n) based on size of stack 
# Problems faced : No problems faced 

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
        current = self.head
        while current:
            if current.next == None:
                current.next = ListNode(data)
            current = current.next

        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        current = self.head
        while current:
            if key == current.data:
                return key
            current = current.next
        return None
        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        current = self.head
        if current:
            if key == current.data:
                self.head = self.head.next
                current = None
                return
        
        while current:
            if key == current.data:
                break
            previous = current
            current = current.next 
        
        if current == None:
            return 
        previous.next = current.next
        current = None

