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
        
        # If list is empty, make the new node the head
        if self.head is None:
            self.head = new_node
            return
            
        # Otherwise, traverse to the end of the list
        current = self.head
        while current.next:
            current = current.next
            
        # Append the new node at the end
        current.next = new_node
        

        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        current = self.head
        
        # Traversing the list
        while current:
            # Searching for target
            if current.data == key:
                return current  
            current = current.next
            
        # If key not found - return None
        return None
        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        # If the list is empty
        if self.head is None:
            return
            
        # If head node itself holds the key to be deleted
        if self.head.data == key:
            self.head = self.head.next
            return
            
        # Search for the key to be deleted, keep track of the
        # previous node as we need to change 'prev.next'
        current = self.head
        while current.next and current.next.data != key:
            current = current.next
            
        # If key was not present in linked list
        if current.next is None:
            return
            
        # Unlink the node from linked list
        current.next = current.next.next
