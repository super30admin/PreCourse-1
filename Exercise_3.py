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
            current = self.head
            while current.next:
                current = current.next
            current.next = new_node

    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        current = self.head
        while current:
            if current.data == key:
                return current
            current = current.next
        return None

    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        if self.head is None:
            return

        if self.head.data == key:
            self.head = self.head.next
            return

        current = self.head
        prev = None
        while current:
            if current.data == key:
                prev.next = current.next
                return
            prev = current
            current = current.next

    def display(self):
        """
        Display the elements in the list.
        Takes O(n) time.
        """
        current = self.head
        while current:
            print(current.data, end=" ")
            current = current.next
        print()


# Example usage:
my_list = SinglyLinkedList()
my_list.append(1)
my_list.append(2)
my_list.append(3)
my_list.append(4)

my_list.display()

print(my_list.find(3))

my_list.remove(2)
my_list.display()
