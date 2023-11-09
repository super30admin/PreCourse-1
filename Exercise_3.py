"""
Time Complexity : provided in the methods
Did this code successfully run on Leetcode : could not find it on leetcode
Any problem you faced while coding this : No


Your code here along with comments explaining your approach

"""

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
        node = ListNode(data)
        if self.head is None:
            self.head = node
            return
            
        curr = self.head
        
        while curr.next is not None:
            curr = curr. next
        
        curr.next = node
        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        if self.head is None:
            return None
        
        curr = self.head
        
        while curr is not None:
            if curr.data == key:
                return curr
            
        return None
        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        curr = self.head
        
        if curr is None or key is None:
            return None
        
        if (curr and curr.data == key):
            self.head = curr.next
            curr = None
            return 

        while curr is not None:
            if curr.next.data == key:
                temp = curr.next
                curr.next = curr.next.next
                temp = None
                return
            else:
                curr = curr.next
