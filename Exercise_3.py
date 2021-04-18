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
        new = ListNode(data)
        if self.head is not None:
            current = self.head
            while current.next is not None:
                current = current.next
            current.next = new
        else:
            self.head = new

    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        current = self.head
        if current.data == key:
            return current
        while current is not None:
            if current.data == key:
                return current
            current = current.next

        return None


    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        if self.head.data == key:
            self.head = self.head.next
        prev = self.head
        current = self.head.next
        while current is not None:
            if current.data == key:
                prev.next = current.next
                return
            current = current.next
            prev = prev.next
