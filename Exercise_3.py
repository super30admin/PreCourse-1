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
            self.head = ListNode(data,None)
        else:
            last = self.head
            while last.next is not None:
                last = last.next
            new_node = ListNode(data,None)
            last.next = new_node

    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        if self.head is None:
            return None
        else:
            node = self.head
            while node is not None:
                if node.data == key:
                    return key
            return None
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        if self.head is None:
            return None
        else:
            prev = self.head
            cur = self.head.next
            if self.head.data == key:
                self.head = self.head.next
                return
            while cur is not None:
                if cur.data == key:
                    prev.next = cur.next
                    cur.next = None
                    return
                prev = prev.next
                cur = cur.next
