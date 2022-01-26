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
        self.head = Node(data = None)
    # Time: O(n)
    def append(self, data):
        """
        Insert a new element at the end of the list.
        Takes O(n) time.
        """
        curr = self.head
        while curr.next != None:
            curr = curr.next
        temp = None(data)
        curr.next = temp
        
        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        curr = self.head
        while curr.next != None:
            if curr.data = key:
                return key
            curr = curr.next
        return None
        
        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        prev = self.head
        curr = prev.next
        while curr != None:
            if curr.data = key:
                prev.next = curr.next
                return
            curr = curr.next
        

