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
        NN = ListNode(data)
        if self.head is None:
            self.head = NN
        else:
            current = self.head
            while current.next:
                current = current.next
            current.next = NN

        
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
        return None
        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        current = self.head

        # If the key is the head, then remove it
        if current and current.data == key:
            self.head = current.next
            return

        # If the key is not the head, then search for it
        while current.next:
            if current.next.data == key:
                current.next = current.next.next
                return
            current = current.next
