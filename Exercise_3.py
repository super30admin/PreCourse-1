# Time Complexity : O(1) for creation of node, O(1) for append ; O(n) for find and remove operations 
# Space Complexity : O(n) -> total space for ll
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : None
class ListNode:
    """
    A node in a singly-linked list.
    """
    def __init__(self, data=None, next=None):
        self.data=data
        self.next=next
    
class SinglyLinkedList:
    def __init__(self):
        """
        Create a new singly-linked list.
        Takes O(1) time.
        """
        self.head = None
        self.tail=None

    def append(self, data):
        """
        Insert a new element at the end of the list.
        Takes O(1) time.
        """
        nn= ListNode(data)
        if self.head is None:
            self.head=nn
            self.tail=nn
        else:
            self.tail.next=nn
            self.tail=nn

    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        if self.head is None:
            return None
        curr=self.head
        while curr:
            if curr.data==key:
                return curr
            curr=curr.next
        return None

    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        curr=self.head
        prev=None
        while curr:
            if curr.data==key:
                if prev:
                    prev.next=curr.next
                else:
                    self.head=curr.next
                return
            prev=curr
            curr=curr.next