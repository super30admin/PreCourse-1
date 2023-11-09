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
        new_node = ListNode(data)
        if self.head is None:
            self.head = new_node
            return
        end_node = self.head
        while end_node.next:
            end_node = end_node.next
        end_node.next = new_node

    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        node = self.head
        while node.next:
            if node.data == key:
                return node
            else:
                return None

    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        #empty list check
        if self.head is None:
            return
        # remove node at start
        if self.head.data == key:
            temp_node = self.head
            self.head = temp_node.next
            temp_node.next = None
        # remove node at any other place
        prev_node = self.head
        node = self.head.next
        while node.next:
            if node.data == key:
                break
            else:
                prev_node = prev_node.next
                node = node.next
        prev_node.next = node.next
        node.next = None

