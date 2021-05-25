# Author: Ritika Chadha
# Exercise_3 : Implement Singly Linked List

# Time Complexity: O(n)
# Space Complexity: O(n)
# Did this code successfully run on Leetcode: Yes
# Any problem you faced while coding this: No

class ListNode:
    """
    A node in a singly-linked list.
    """
    def __init__(self, data=None, next=None):
        self.data = data
        self.next = None
    
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
        temp = ListNode(data)

        if self.head is None:
            self.head = temp
        
        else:
            ptr = self.head
            while(ptr.next is not None):
                ptr = ptr.next
            ptr.next = temp
        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """

        ptr = self.head
        while(ptr is not None):
            if ptr.data == key:
                return key
            else:
                return None

        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """

        prev = None
        curr = self.head
        while(curr!=None):

            if curr.data == key:
                if curr.next == None and prev == None:
                    self.head = None
                else:
                    prev.next = curr.next
            
            prev = curr
            curr = curr.next