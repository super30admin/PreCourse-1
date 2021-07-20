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
        self.size = 0

    def append(self, data):
        """
        Insert a new element at the end of the list.
        Takes O(n) time.
        """
        data_node = ListNode(data)

        if self.size == 0:
            self.head = ListNode(data)
        else:
            cur = self.head
            while cur.next:
                cur = cur.next
            cur.next = data_node
        self.size += 1

    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        cur = self.head

        while cur.next:
            if cur.data == key:
                return cur
            else:
                cur = cur.next
        return None

    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        cur = self.head
        last = None
        while cur.next:
            if cur.data == key:
                break
            else:
                last = cur
                cur = cur.next
        if last is None:
            self.head = cur.next
        else:
            last.next = cur.next
        self.size -= 1

s = SinglyLinkedList()
s.append(3)
s.append(4)
s.append(4)
s.append(4)
s.append(4)
print(s.size)
s.remove(4)
print(s.size)


