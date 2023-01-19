# Time Complexity : O(n)
# Space Complexity : O(n)
# Did this code successfully run on Leetcode : I did not find the exact question on Leetcode
# Any problem you faced while coding this : Yes, Not sure whether the solution is right or not
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
        if self.head is None:
            self.head = data
        else:
            node = self.head
            while node is not None:
                node = node.next
            node.next = data

    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        if self.head is None:
            return None
        node = self.head
        while node is not None:
            if key == node.data:
                break
            node = node.next
        if node is None:
            return None
        else:
            return node

    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        if self.head is None:
            return None
        node = self.head
        while node is not None:
            if key == node.data:
                break
            node = node.next
        if node is None:
            print('Key not found')
        else:
            node.next = node.next.next

