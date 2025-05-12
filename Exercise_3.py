"""
Time Complexity -> O(N) where N is the number of nodes in the linked list
Space Complexity -> O(N) where N is the number of nodes in the linked list

Had some difficulty in implementing the remove function esp when the element to be removed
was the first element.
"""


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
        if not self.head:
            self.head = node
        else:
            ptr = self.head
            while ptr.next is not None:
                ptr = ptr.next
            ptr.next = node

    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        ptr = self.head
        while ptr is not None:
            if ptr.data == key:
                return ptr.data
            ptr = ptr.next
        return None

    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        ptr = self.head
        prev = None

        while ptr:
            if ptr.data == key:
                if prev is None:
                    # Removing head
                    self.head = ptr.next
                else:
                    prev.next = ptr.next
                return  # Remove only first occurrence
            prev = ptr
            ptr = ptr.next


sll = SinglyLinkedList()
sll.append(1)
sll.append(2)
sll.append(3)
print(sll.find(2))
sll.remove(2)
print(sll.find(2))
print(sll.find(1))
