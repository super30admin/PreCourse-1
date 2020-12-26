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
        self._DUMMY = ListNode()
        self.head = self._DUMMY

    def append(self, data):
        """
        Insert a new element at the end of the list.
        Takes O(n) time.
        """
        node = ListNode(data)
        walk = self.head
        while walk.next is not None:
            walk = walk.next
        walk.next = node

    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        walk = self.head.next
        while walk is not None:
            if walk.data == key:
                return walk.data
            walk = walk.next
        return None

    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        walk = self.head
        while walk.next is not None:
            if walk.next.data == key:
                walk.next = walk.next.next
                return
            walk = walk.next

    def printList(self):
        """
        Prints the `data` of all nodes from the head to the end.
        Takes O(n) time.
        """
        walk = self.head.next
        while walk is not None:
            print(walk.data, end=' -> ')
            walk = walk.next
        print()
