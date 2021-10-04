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
            self.head = ListNode(data, None)
        else:
            current_pointer = self.head
            while current_pointer.next is not None:
                current_pointer = current_pointer.next
            current_pointer.next = ListNode(data, None)

    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        current_pointer = self.head
        while current_pointer is not None and current_pointer.data != key:
            current_pointer = current_pointer.next
        return current_pointer

    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        current_pointer = self.head
        previous_pointer = None
        while current_pointer is not None and current_pointer.data != key:
            previous_pointer = current_pointer
            current_pointer = current_pointer.next
        if previous_pointer is None:
            self.head = current_pointer.next
        else:
            if current_pointer:
                previous_pointer.next = current_pointer.next


linked_list = SinglyLinkedList()
linked_list.append(1)
linked_list.append(2)
linked_list.append(3)
print(linked_list.find(2))
linked_list.remove(3)
print(linked_list.find(3))
linked_list.remove(2)
print(linked_list.find(2))
