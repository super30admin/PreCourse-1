# Time Complexity : O(1)- append, others - O(n)
# Space Complexity :O(n)
# Did this code successfully run on Leetcode :yes
# Any problem you faced while coding this :yes


# Your code here along with comments explaining your approach
# The code creates a singly linked list where each node stores a value and a pointer to the next node.
# Insertion takes O(n) because it traverses to the last node before appending, and printing also takes O(n) as it visits all nodes.
# Space complexity is O(n) since each inserted element allocates a new node in memory.

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
        new_node = ListNode(data)

        # If list is empty
        if self.head is None:
            self.head = new_node
            return

        # Traverse to the end
        current = self.head
        while current.next:
            current = current.next

        current.next = new_node
        
    def find(self, key):
        """
        Search for the first element with data == key.
        Return the node or None.
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
        Remove the first occurrence of key in the list.
        Takes O(n) time.
        """

        current = self.head
        previous = None

        if not current:
            return

        if current.data == key:
            self.head = current.next
            return

        while current:
            if current.data == key:
                previous.next = current.next
                return
            previous = current
            current = current.next
