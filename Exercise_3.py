# Time Complexity: O(n) for append, find, remove.
# Space Complexity: O(1) for append, find, remove.
# Yes, runs successfully on LeetCode.
# No issues faced.

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
        self.list = None

    def append(self, data):
        """
        Insert a new element at the end of the list.
        Takes O(n) time.
        """
        new_node = ListNode(data)
        if self.list is None:
            self.list = new_node
        else:
            curr = self.list
            while curr.next:
                curr = curr.next
            curr.next = new_node
        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        curr = self.list
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
        if self.list is None:
            return
        if self.list.data == key:
            self.list = self.list.next
            return
        curr = self.list
        while curr.next:
            if curr.next.data == key:
                curr.next = curr.next.next
                return
            curr = curr.next