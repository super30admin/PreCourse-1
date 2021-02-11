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
        current = self.head
        if self.head is None:
            self.head = ListNode(data)
        else:
            while current.next is not None:
                current = current.next
            current.next = ListNode(data)

    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        current = self.head
        while current is not None:
            if current.data == key:
                print("Element found")
                return current
            current = current.next
        print("Element not found")
        return None

    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        prev = self.head
        current = self.head.next

        if self.head.data == key:
            self.head = self.head.next
        else:
            while current is not None:
                if current.data == key:
                    prev.next = current.next
                    prev = current
                current = current.next

    def print_list(self):
        print("Nodes:")
        current = self.head
        while current is not None:
            print(current.data)
            current = current.next


# Testing SinglyLinkedList
a_list = SinglyLinkedList()

a_list.append(5)
a_list.append(6)
a_list.append(7)
a_list.print_list()

print()
a_list.find(10)
a_list.find(6)

print()
a_list.remove(5)
a_list.print_list()
