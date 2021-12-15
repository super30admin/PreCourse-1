# Time Complexity:
#   * append: O(n) - iterate trough nodes and insert at the end
#   * find: O(n) - iterate trough nodes until value match
#   * remove: O(n) - iterate trough nodes until value match, and then remove in place
# Space Complexity: O(n) - for n nodes in the list
# Did this code successfully run on Leetcode: Yes
# Any problem you faced while coding this: No


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
        newnode = ListNode(data)
        if not self.head:
            self.head = newnode
        else:
            node = self.head
            while node.next:
                node = node.next
            node.next = newnode

    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        node = self.head
        while node:
            if node.data == key:
                return node
            node = node.next
        return None

    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        node = self.head
        if node.data == key:
            self.head = self.head.next
        while node.next:
            if node.next.data == key:
                node.next = node.next.next
                break
            node = node.next
        return None
