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
        curr = self.head
        while curr.next:
            curr = curr.next
        curr.next = ListNode(data)
        return

    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        curr = self.head
        while curr:
            if curr.data == key:
                return key
        return None

    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        if self.head.data == key:
            if self.head.next:
                prev = self.head
                self.head = None
                self.head = prev.next
            else:
                self.head = None
            return

        prev = None
        curr = self.head
        while curr and curr.next:
            if curr.data == key:
                prev.next = curr.next
                curr = None
                return
            prev = curr
            curr = curr.next
        if curr.data == key:
            prev.next = None
            curr = None
            return
        return

    def print_list(self):
        curr = self.head
        while curr:
            print(curr.data)
            curr = curr.next


sll = SinglyLinkedList()
sll.append(1)
sll.append(2)
sll.append(3)
sll.append(4)
sll.append(5)
sll.append(6)
sll.append(7)
sll.remove(1)
sll.remove(4)
sll.remove(7)
print("-----printing LL-----")
sll.print_list()
