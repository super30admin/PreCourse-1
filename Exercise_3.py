class ListNode:
    """
    A node in a singly-linked list.
    """
    def __init__(self, data=None, next=None):
        self.data = data
        self.next = next

class SinglyLinkedList:
    # Time Complexity : O(1)
    # Space Complexity : O(1)
    # Did this code successfully run on Leetcode : N/A
    # Any problem you faced while coding this : No
    # Initialize the singly linked list with None
    def __init__(self):
        """
        Create a new singly-linked list.
        Takes O(1) time.
        """
        self.head = None

    # Time Complexity : O(n)
    # Space Complexity : O(1)
    # Did this code successfully run on Leetcode : N/A
    # Any problem you faced while coding this : No
    # Iterate all the way to the end and add the new node
    def append(self, data):
        """
        Insert a new element at the end of the list.
        Takes O(n) time.
        """
        if self.head = None:
            self.head = ListNode(data)
        else:
            toAdd = ListNode(data)
            curNode = self.head
            while curNode.next not None:
                curNode = curNode.next
            curNode.next = toAdd

    # Time Complexity : O(n)
    # Space Complexity : O(1)
    # Did this code successfully run on Leetcode : N/A
    # Any problem you faced while coding this : No
    # Iterate all the way to the end until key is found
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        iter = self.head
        while iter.next is not None:
            if iter.data == key:
                return iter
            else:
                iter = iter.next
        return None

    # Time Complexity : O(n)
    # Space Complexity : O(1)
    # Did this code successfully run on Leetcode : N/A
    # Any problem you faced while coding this : No
    # Iterate all the way to the end until key is found and then removed
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        if self.head.data == key:
            self.head = self.head.next
        else:
            iter = self.head
            while iter.next is not None:
                if iter.next.data == key:
                    iter.next = iter.next.next
                else:
                    iter = iter.next
