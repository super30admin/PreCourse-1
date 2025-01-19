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

        new_node = ListNode(data)

        if self.head is None:
            self.head = new_node
            return
        
        current = self.head
        if current.next is not None:
            current = current.next

        current.next = new_node


        """
        Insert a new element at the end of the list.
        Takes O(n) time.
        """

        
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
        previous = None

        if current is None:
            return None
        
        if current.data == key:
            self.head = current.next
            current = None
            return

        while current:
            if current.data == key:
                previous.next = current.next
                current = None
            previous = current
            current = current.next
        return None

