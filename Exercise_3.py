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
        newNode = ListNode(data, None)
        if self.head is None:
            self.head = newNode
        else:
            newHead = self.head
            while newHead.next is not None:
                newHead = newHead.next
            newHead.next = newNode

    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        newHead = self.head
        while (newHead is not None):
            if newHead.data == key:
                return newHead.data
            newHead = newHead.next

        else:
            return None

    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        newHead = self.head
        if newHead is not None:
            if newHead.data == key:
                self.head = newHead.next
            else:
                while (newHead is not None):
                    if newHead.next.data == key:
                        newHead.next = newHead.next.next
                        break
                    newHead = newHead.next

