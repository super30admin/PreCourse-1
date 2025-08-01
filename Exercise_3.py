# Time Complexity: append/find/remove/print_list = O(n); __init__ = O(1)
# Space Complexity: O(n) for n nodes; O(1) auxiliary space per operation

class ListNode:
    """
    A node in a singly-linked list.
    """

    def __init__(self, data=None, next=None):
        self.data = data  # The value stored in this node
        self.next = next  # Pointer to the next node


class SinglyLinkedList:
    def __init__(self):
        """
        Create a new singly-linked list.
        Takes O(1) time.
        """
        self.head = None

    def append(self, data):
        new_node = ListNode(data)
        if not self.head:
            self.head = new_node
            return
        current = self.head
        while current.next:
            current = current.next
        current.next = new_node  # Link new node at the end

    def find(self, key):
        current = self.head
        while current:
            if current.data == key:
                return current
            current = current.next
        return None

    def remove(self, key):
        current = self.head
        prev = None
        while current:
            if current.data == key:
                if prev:
                    prev.next = current.next  # skip the current node
                else:
                    self.head = current.next
                return
            prev = current
            current = current.next

    def print_list(self):
        current = self.head
        while current:
            print(current.data, end=" -> ")
            current = current.next
        print("None")






