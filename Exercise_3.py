# Time Complexity : 
#   append(data) → O(n) — Traverses the entire list to insert at the end
#   find(key)    → O(n) — Linear search for the key
#   remove(key)  → O(n) — Linear search to locate and unlink the node

# Space Complexity : 
#   O(n) — for storing n nodes (each node has a data field and a reference)

# Did this code successfully run on Leetcode : 
# N/A — This is a general-purpose linked list implementation for practice or local testing.

# Any problem you faced while coding this :
# No major issues. Just had to make sure edge cases were handled:
# - Appending to an empty list
# - Removing the head node
# - Removing a non-existent key

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
        if self.head is None:
            self.head = new_node
            return

        current = self.head
        while current.next:
            current = current.next
        current.next = new_node

    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the node or `None` if not found.
        Takes O(n) time.
        """
        current = self.head
        while current:
            if current.data == key:
                return current
            current = current.next
        return None

    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        current = self.head
        prev = None

        while current:
            if current.data == key:
                if prev is None:
                    self.head = current.next  # removing head
                else:
                    prev.next = current.next
                return True  # Removed successfully
            prev = current
            current = current.next
        return False  # Key not found
