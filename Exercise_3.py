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
        if self.head:
            dummy = self.head
            while dummy.next:
                dummy = dummy.next
            dummy.next = ListNode(data)
        else:
            self.head = ListNode(data)

    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        if self.head:
            dummy = self.head
            while dummy.next:
                if dummy.data == key:
                    return dummy
                dummy = dummy.next
        else:
            return None

    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        dummy = ListNode(0)
        dummy.next = self.head

        curr, prev = self.head, dummy
        while curr:
            if curr.data == key:
                prev.next = curr.next
                break
            else:
                prev = curr
                curr = curr.next
        return dummy.next
