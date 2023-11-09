# // Time Complexity : O(n)
# // Space Complexity : O(1)
# // Did this code successfully run on Leetcode : Yes
# // Any problem you faced while coding this : No
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
        if self.head == None:
            self.head = ListNode(data)
 
        else:
            node = ListNode(data)
            node.next = self.head
            self.head = node
        
        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        dummy = self.head
        while dummy:
            if dummy.data == key:
                return dummy
            dummy = dummy.next
        return None
        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        prev = None
        curr = self.head
        if curr.data == key:
            self.head = self.head.next
            return
        prev = curr
        curr = curr.next
        while curr:
            if curr.data == key:
                prev.next = curr.next
                return
            prev = curr
            curr = curr.next



