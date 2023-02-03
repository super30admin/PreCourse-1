# Time Complexity : o(n)
# Space Complexity : O(1)
class ListNode:
    """
    A node in a singly-linked list.
    """
    def __init__(self, data=None, next=None):
        self.head = []
class SinglyLinkedList:
    def __init__(self):
        """
        Create a new singly-linked list.
        Takes O(1) time.
        """
        self.head = None

    def append(self, data):
        self.head.append(data)
        
        """
        Insert a new element at the end of the list.
        Takes O(n) time.
        """
        
    def find(self, key):
        self.head.contains(key)
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        
    def remove(self, key):
        self.head.remove(key)
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
