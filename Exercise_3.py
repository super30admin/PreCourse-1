class ListNode:
    """
    A node in a singly-linked list.
    """
    def __init__(self, data=None, next=None):
        self.data=data
        self.next=next
    
class SinglyLinkedList:
    def __init__(self):
        """
        Create a new singly-linked list.
        Takes O(1) time.
        Space Complexity: O(1)
        """
        self.head = None

    def append(self, data):
        """
        Insert a new element at the end of the list.
        Takes O(n) time, as we have to traverse till end.
        Space Complexity: O(1), one new node created
        """
        new_node=ListNode(data)
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
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        Space Complexity: O(1), no extra space beside pointers
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
        Space Complexity: O(1), just pointer changes
        """
        current = self.head
        prev = None

        while current:
            if current.data == key:
                if prev:
                    prev.next = current.next
                else:
                    # Removing head
                    self.head = current.next
                return  # Early return after removing
            prev = current
            current = current.next
