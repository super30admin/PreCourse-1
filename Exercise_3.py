# Time Complexity : O(n)
# Space Complexity :O(1)
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
        # create new_node with the data provided in input
        new_node = ListNode(data)
        # Initialise current to head of the linked list
        current = self.head
        if current:
            # Loop until end of the list is reached
            while current.next:
                current = current.next
            # Append the new node as last element
            current.next = new_node
        else:
            # If head is none, append the new node as head
            self.head = new_node

    def find(self, key):
        """hhhgb
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        # Initialise current to head
        current = self.head
        while current:
            # Check if data of current matches key, return the element if found else return None
            if current.data == key:
                return current
            current = current.next
        return None

    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        # Initialize prev and current variables
        prev = None
        current = self.head
        # Assigning next node of prev to next node of current
        while current:
            if current.data == key:
                # If previous is None, then we have to remove at the head, so assigning head to next of current
                if prev is None:
                    self.head = current.next
                else:
                    prev.next = current.next
                # returns key if the key is removed successfully else -1
                return key
            prev = current
            current = current.next
        return -1
