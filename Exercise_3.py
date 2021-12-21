# Time Complexity : append, find , remove  O(N)
# Space Complexity : O(N) : number of elements
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No


# Your code here along with comments explaining your approach
"""
1. initializing singly LL with head
2. append : if the head is empty update head with new linknode else loop through next of node and at the end append the new node
3. find : if the head data is key return key  else loop through next of node till the end and check the each data with key if matches return the key
4. remove : if the head is data to remove , update head with head.next .
else loop though nodes check the next node whether matches with key if yes then remove and update the next

"""


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
        node = ListNode(data)
        if not self.head:
            self.head = node
            return

        pos = self.head
        while pos.next:
            pos = pos.next
        pos.next = node

    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        pos = self.head
        if pos.data == key:
            return key
        while pos:
            if pos.data == key:
                return key
            pos = pos.next

        return None

    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """

        if self.head.data == key:
            self.head = self.head.next
            return

        pos = self.head
        while pos and pos.next:
            node = pos.next
            if node.data == key:
                pos.next = node.next
                return
            pos = pos.next


l = SinglyLinkedList()
l.append(1)
l.append(2)
l.append(3)
print(l.find(3))
l.remove(2)
l.remove(3)
print(l.find(2))
