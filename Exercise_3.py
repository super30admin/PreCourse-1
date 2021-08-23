"""
Problem: Implement Singly Linked List

Time Complexity:
    * __init__  : O(1)
    * append    : O(1)
    * find      : O(n)
    * remove    : O(n)

Space Complexity:
    * __init__  : O(1)
    * append    : O(1)
    * find      : O(n)
    * remove    : O(n)

Pass on LeetCode: N/A
Problems Occurred: N/A
"""


from typing import List


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
        start = self.head
        if start:
            runner = start
            while runner.next:
                runner = runner.next
            runner.next = ListNode(data)
            self.head = start
        else:
            self.head = ListNode(data)
        self.head = start

        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        start = self.head
        runner = start
        while runner:
            if runner.data == key:
                return runner 
            runner = runner.next
        self.head = start
        return None
        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        start = self.head
        runner = start
        previous = None
        while runner:
            if runner.data == key:
                if not previous:
                    start = start.next
                else:                    
                    previous.next = runner.next
                break
            previous = runner
            runner = runner.next
        self.head = start
            