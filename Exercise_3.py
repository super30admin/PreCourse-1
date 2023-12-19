""" 
// Time Complexity : O(1)
// Space Complexity : Worst case O(n), Best case O(1)
// Did this code successfully run on Leetcode : Didn't try, runs on machine
// Any problem you faced while coding this : Got confused between two classes.


// Your code here along with comments explaining your approach
Most of the functions are straight forward. Followed same approach as exercise_1.py
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
        if not self.head:
            self.head = ListNode(data=data)
            return
        curr = self.head
        while curr.next:
            curr = curr.next
        curr.next = ListNode(data=data)
        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        curr = self.head
        while curr and curr.data!=key:
            curr = curr.next
        return curr 

        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """

        elem = self.find(key)
        if not elem:
            return
        if node.prev:
            node.prev.next = node.next
        if node.next:
            node.next.prev = node.prev
        if node is self.head:
            self.head = node.next

        node.prev = None
        node.next = None