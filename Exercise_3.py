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
        if self.head is None:
            self.head = ListNode(data)
            return
        current = self.head
        while current.next:
            current = current.next
        current.next = ListNode(data)

        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        if self.head is None:
            return None
        current = self.head
        while current:
            if current.data == key:
                return current.data
            current = current.next
        return None
        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        current = self.head
        if current is None:
            return None
        if current.data == key:
            self.head = current.next
            return
        previous = current
        current = current.next
        while current:
            if current.data == key:
                previous.next = current.next
                return
            previous = current
            current = current.next
        return None


    

