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
        self.head = ListNode(-1)

    def append(self, data):
        """
        Insert a new element at the end of the list.
        Takes O(n) time.
        """
        cur = self.head
        while cur.next is not None:
            cur = cur.next
        cur.next = ListNode(data)

    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        cur = self.head.next
        while cur is not None:
            if cur.data == key:
                return cur.data
            cur = cur.next

        return None

    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        cur = self.head
        while cur.next is not None:
            if cur.next.data == key:
                cur.next = cur.next.next
            cur = cur.next


# s = SinglyLinkedList()
# for i in range(10):
#     s.append(i)
#     print("Added ", i, " to the list")
#
# for i in range(0, 2):
#     print("Searching for ", i, " Found : ", s.find(i))
#     s.remove(i)
#     print("Removed ", i)
#     print("Searching for ", i, " Found : ", s.find(i))


