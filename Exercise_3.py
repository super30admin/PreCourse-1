# Time Complexity : O(n)
# Space Complexity : O(n)
# Did this code successfully run on Leetcode : Could not find the problem in Leetcode
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
        self.head = None

    def append(self, data):
        """
        Insert a new element at the end of the list.
        Takes O(n) time.
        """
        node = ListNode(data)
        if self.head:
            curr = self.head
            while curr.next is not None:
                curr = curr.next
            curr.next = node
        else:
            self.head = node

    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        curr = self.head
        while curr:
            if curr.data == key:
                return curr
            curr = curr.next
        return None
        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        if self.head.data == key:
            temp = self.head
            self.head = self.head.next
            temp = None
        else:
            prev = self.head
            curr = prev.next
            while curr:
                if curr.data == key:
                    prev.next = curr.next
                    curr = None
                    break
                prev = curr
                curr = curr.next