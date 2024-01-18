# Time Complexity : O(n) for all operations
# Space Complexity : O(n) where n is the maximum size of the list at any point
# Did this code successfully run on Leetcode : Not available on leetcode
# Any problem you faced while coding this : No


# Your code here along with comments explaining your approach


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
        newNode = ListNode(data)
        # empty list
        if not self.head:
            self.head = newNode
            return

        temp = self.head
        # appending in the end
        while temp.next != None:
            temp = temp.next
        temp.next = newNode

    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        temp = self.head
        while temp != None:
            if temp.data == key:
                return temp
            temp = temp.next
        return None

    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        if self.head.data == key:
            self.head = self.head.next
            return
        temp = self.head

        while temp.next != None:
            if temp.next.data == key:
                temp.next = temp.next.next
                return
            temp = temp.next
