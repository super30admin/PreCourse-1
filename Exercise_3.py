# Time Complexities
# append: O(n)
# find: O(n)
# remove: O(n)

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
        if self.head is None:
            self.head = ListNode(data)
        new = ListNode(data)
        curr = self.head
        while (curr.next is not None):
            curr = curr.next
        curr.next = new
         
        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        curr = self.head
        while curr is not None:
            if curr.data == key:
                return curr
            curr = curr.next
        return None
        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        if self.head is not None:
            if self.head.data == key:
                self.head = self.head.next
                return 
        
        curr = self.head
        prev = ListNode()
        prev.next = curr
        
        while curr is not None:
            if curr.data == key:
                prev.next = curr.next
                curr = None
                return
            prev = curr
            curr = curr.next
        
        return

