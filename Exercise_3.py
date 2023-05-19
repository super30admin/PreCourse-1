# Time Complexity: O(n) for append, find, remove.
# Space Complexity: O(1) for append, find, remove.
# Yes, runs successfully on LeetCode = N/A.
# No issues
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

        if self.head is None:
            self.head = ListNode(data)
        else:
            current = self.head
            while current.next is not None:
                current = current.next
            current.next = ListNode(data)
        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        current = self.head
        while current is not None:
            if current.data == key:
                return current
            current = current.next
        return None
        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        if self.head is None:
            return

        if self.head.data == key:
            self.head = self.head.next
            return

        current = self.head
        while current.next is not None:
            if current.next.data == key:
                current.next = current.next.next
                return
            current = current.next
