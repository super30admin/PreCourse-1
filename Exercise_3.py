# Time Complexity : O(n)
# Space Complexity : O(n)
# Did this code successfully run on Leetcode : Couldn't find this problem on Leetcode
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
        # Create new node
        new_node = ListNode(data)
        
        # If list is empty, make new node as head
        if self.head is None:
            self.head = new_node
            return
            
        # Traverse to the last node
        current = self.head
        while current.next:
            current = current.next
            
        # Add new node at the end
        current.next = new_node
        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        current = self.head
        
        # Traverse the list
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
        # If list is empty
        if self.head is None:
            return
            
        # If head node is the key
        if self.head.data == key:
            self.head = self.head.next
            return
            
        # Find the node before the one to be deleted
        current = self.head
        while current.next:
            if current.next.data == key:
                # Skip the node to be deleted
                current.next = current.next.next
                return
            current = current.next
