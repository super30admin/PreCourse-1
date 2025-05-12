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
        element = ListNode(data)

        if self.head is None:
            self.head = element
            return
        
        pointer = self.head
        while pointer.next is not None:
            pointer = pointer.next
        pointer.next = element
        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        pointer = self.head
        while pointer is not None:
            if pointer.data == key:
                return pointer
            pointer = pointer.next
        return None
        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        if self.head is None:
            return
        
        if self.head.data == key:
            self.head = self.head.next
            return

        pointer = self.head
        while pointer.next is not None:
            if pointer.next.data == key:
                pointer.next = pointer.next.next
                break
            pointer = pointer.next