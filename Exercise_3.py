'''
// Time Complexity :O(n)
// Space Complexity :O(n)
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this : No
'''

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
        curr = ListNode(data)
        if self.head == None:
            self.head = curr
            return
        while self.head.next:
            self.head = self.head.next
        self.head.next = curr

    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        while self.head:
            if self.head.data == key:
                return self.head
            else:
                self.head = self.head.next
        return None
        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        prev, curr = None, self.head
        while curr:
            if curr.data == key:
                if prev:
                    prev.next = curr.next
                else:
                    self.head = curr.next

            prev = curr
            curr = curr.next
