class ListNode:
    """
    A node in a singly-linked list.
    """
    def __init__(self, data=None, next=None):
        self.data = data
        self.next = next
        
class SinglyLinkedList:
    def __init__(self):
        # Dummy Node
        """
        Create a new singly-linked list.
        Takes O(1) time.
        """
        self.head = ListNode(-1)
        self.tail = self.head

    # T: O(n), S: O(1)
    def append(self, data):
        """
        Insert a new element at the end of the list.
        Takes O(n) time.
        """
        """Add a node with the given data to the end of the list."""
        newNode = ListNode(data)
        if not self.head:
            self.head = newNode
            print(f"Appended {data} as the head node.")
            return
        current = self.head
        while current.next:
            current = current.next
        current.next = newNode
        print(f"Appended {data} to the linked list.")
    
    # T: O(n), S: O(1)
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        """Find a node with the given value and return it."""
        current = self.head
        while current:
            if current.data == key:
                print(f"Found value: {key}")
                return current
            current = current.next
        print(f"Value {key} not found in the linked list.")
        return None
        
    # T: O(n), S: O(1)
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        """Remove the first node with the given value."""
        if not self.head:
            print("Cannot remove from an empty list.")
            return

        # If the head node is the one to be removed
        if self.head.data == key:
            print(f"Removed the head node with value: {key}")
            self.head = self.head.next
            return

        # Traverse the list to find the node to remove
        current = self.head
        while current.next:
            if current.next.data == key:
                print(f"Removed node with value: {key}")
                current.next = current.next.next
                return
            current = current.next

        print(f"Value {key} not found in the linked list.")
