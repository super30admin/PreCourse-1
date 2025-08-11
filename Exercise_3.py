# Time Complexity : O(n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : N/A
# Any problem you faced while coding this : No

# Your code here along with comments explaining your approach:
#   - Used a ListNode class to represent each node with data and a pointer to next node.
#   - append(): Traverse to the end of the list and link a new node.
#   - find(): Traverse nodes until a matching value is found or end is reached.
#   - remove(): Keep track of previous node, unlink target node when found.

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
        if not self.head:  # If list is empty
            self.head = new_node
            return
        current = self.head
        while current.next:  # Traverse to last node
            current = current.next
        current.next = new_node  # Link last node to new node
        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        current = self.head
        while current:
            if current.data == key:
                return current
            current = current.next
        return None  # Not found
        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        current = self.head
        prev = None

        while current:
            if current.data == key:
                if prev:  # Middle or end node
                    prev.next = current.next
                else:  # Removing head
                    self.head = current.next
                return True  # Key found and removed
            prev = current
            current = current.next
        return False  # Key not found
