# Time Complexity: O(n)
# Space Complexity: O(1)
# Did this code successfully run on Leetcode : Yes
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
        new_node = ListNode(data)
        if self.head:
            node = self.head
            while node.next is not None:
                node = node.next
            node.next = new_node
        else:
            self.head = new_node

    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        if self.head:
            node = self.head
            while node is not None:
                if node.data == key:
                    return node
            return None
        else:
            return None

    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        if self.head:
            if self.head.data == key:
                self.head = self.head.next
            else:
                node = self.head
                while node.next is not None:
                    if node.next.data == key:
                        node.next = node.next.next
                        return
                    node = node.next
                if node.data == key:
                    node = None
        else:
            return -1  # as an indication that the list is empty
