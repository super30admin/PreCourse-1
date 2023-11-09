# Implement Stack Using Singly Linked List


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
        else:
            n = self.head
            while n.next is not None:
                n = n.next
            n.next = new_node

    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        if self.head is None:
            print("LinkedList is Empty")
            return

        n = self.head
        while n is not None:
            if n.data == key:
                # print(n.data)
                return n.data
            n = n.next
        return None

    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        if self.head is None:
            print("LinkedList is Empty")
            return

        # Deleting first node, if key is the first node
        if self.head.data == key:
            self.head = self.head.next
            return

        # Traversing the LinkedList to find the key and delete the key
        n = self.head
        while n.next is not None:
            if n.next.data == key:
                break
            n = n.next

        if n.next is None:
            print("Key not found in the LinkedList")

        else:
            n.next = n.next.next