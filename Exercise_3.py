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
        node = ListNode(data)

        if self.head is None:
            self.head = node
            return

        cur_node = self.head
        while cur_node.next:
            cur_node = cur_node.next
        cur_node.next = node

    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        cur_node = self.head

        if cur_node is None:
            return

        while cur_node is not None:
            if cur_node.data == key:
                return cur_node
            cur_node = cur_node.next

    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        cur_node = self.head
        prev_node = None

        if cur_node is None:
            return

        while cur_node is not None:
            if cur_node.data == key:
                break
            prev_node = cur_node
            cur_node = cur_node.next

        prev_node.next = cur_node.next

    def show(self):
        cur_node = self.head
        while cur_node is not None:
            if cur_node.next is None:
                print(cur_node.data)
            else:
                print(cur_node.data, end="->")
            cur_node = cur_node.next
