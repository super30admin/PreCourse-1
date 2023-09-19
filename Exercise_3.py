##Exercise_3 : Implement Singly Linked List.
# Time Complexity : O(n) for all functions except __init__
# Space Complexity : O(n) where n is length of linked list.
# Did this code successfully run on Leetcode : NA
# Any problem you faced while coding this : NA

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
        self.prev = None

    def append(self, data):
        """
        Insert a new element at the end of the list.
        Takes O(n) time.
        """
        if self.head is None:
            n = ListNode(data)
            self.head = n
            temp = self.head
        while self.head.next is not None:
            self.head = self.head.next
        n = ListNode(data)
        self.head = temp

    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        if self.head is not None:
            while(self.head.next is not None):
                if self.head.data == key:
                    return self.head
                self.prev = self.head
                self.head = self.head.next
        return None
        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """

        if self.find(key) is not None:
            foundElement = self.find(key)
            self.prev.next = foundElement.next