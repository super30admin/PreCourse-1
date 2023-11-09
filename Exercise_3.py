# Exercise_3 : Implement Singly Linked List.
# // Time Complexity : append = O(n), find = O(n), remove = O(n)
# // Space Complexity : O(n), n-> number of elements in Singly Linked List
# // Did this code successfully run on Leetcode : Yes
# // Any problem you faced while coding this : No


# // Your code here along with comments explaining your approach
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
        self.size = 0

    def append(self, data):
        """
        Insert a new element at the end of the list.
        Takes O(n) time.
        """
        # creating a new node with provided data
        new_node = ListNode(data)
        # check if stack is empty
        if not self.head:
            # if empty then set the new_node as head
            self.head = new_node
        # Otherwise
        else:
            # make current with the head
            current = self.head
            # check if next element in current
            while current.next:
                # updating current till the last element is found
                current = current.next
            # appending new node
            current.next = new_node
        self.size += 1

    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        # make current with the head
        current = self.head
        # check if next element in current
        while current.next:
            # check if key is found and return
            if current.data == key:
                return current
            # updating current till the last element
            current = current.next
        return None

    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        # check if stack is empty
        if not self.head:
            # return None if empty
            return None
        # check if first element is the key
        if self.head.data == key:
            # removing connection
            self.head = self.head.next

        # make current with the head
        current = self.head
        # check if next element in current
        while current.next:
            # check if key is found in current's next data
            if current.next.data == key:
                # removing connection
                current.next = current.next.next
                return
            # updating current till the last element is found
            current = current.next
