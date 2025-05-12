# Time Complexity:
#     append(data): O(n)
#     find(key): O(n)
#     remove(key): O(n)
# Space Complexity: O(n)
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
        if not self.head:
            self.head = ListNode(data)
            return
        current = self.head
        while current.next:
            current = current.next
        current.next = ListNode(data)

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

        # If the node to be deleted is head node
        if self.head.data == key:
            self.head = self.head.next
            return

        current = self.head
        while current.next:
            if current.next.data == key:
                current.next = current.next.next
                return
            current = current.next


linked_list = SinglyLinkedList()
linked_list.append(1)
linked_list.append(2)
linked_list.append(3)

print(linked_list.find(2).data)  # Output: 2
linked_list.remove(2)
print(linked_list.find(2))  # Output: None
