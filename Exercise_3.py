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

        if self.head is None:
            self.head = ListNode(data)
            return

        c = self.head

        while c.next is not None:
            c = c.next

        c.next = ListNode(data)
        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """

        c = self.head

        if c is None:
            return None

        while c.data != key:
            c = c.next
            if c is None:
                return None

        return c

    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """

        if self.head is None:
            return None

        if self.head.data == key:
            self.head = None
            return key

        if self.head.next is None:
            return None

        if self.head.next.data == key:
            self.head.next = self.head.next.next
            return key

        c = self.head

        while c.next.data != key:
            c = c.next
            if c.next is None:
                return None

        c.next = c.next.next
        return key

