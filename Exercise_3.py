# Time Complexity : O(n)
# Space Complexity :O(n)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

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
        self.head = ListNode()

    def append(self, data):
        """
        Insert a new element at the end of the list.
        Takes O(n) time.
        """
        if not self.head.data:
            self.head.data = data
            return

        self.curr = self.head
        while self.curr.next:
            self.curr = self.curr.next
        
        self.curr.next = ListNode(data)
        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        self.curr = self.head

        while self.curr:
            if self.curr.data == key:
                return self.curr.data
            self.curr = self.curr.next
        
        return None
        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        if self.head.data == key or not self.head.data:
            self.head.data = None 
            return

        self.curr = self.head

        while self.curr.next:
            if self.curr.next.data == key:
                self.curr.next = self.curr.next.next
                return
            self.curr = self.curr.next
