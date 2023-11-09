from platform import node

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

    # if the head is none -> the list is empty and assign head to the element to be appended
    # else -> continue to iterate until the last element is reached(next pointer points to null)
    # at the last element intialize the new node to appended and the previous pointer to this node
    def append(self, data):
        """
        Insert a new element at the end of the list.
        Takes O(n) time.
        """
        current = self.head
        if current:
            while current.next:
                current = current.next
            current.next = ListNode(data)
        else:
            self.head = ListNode(data)

    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        current = self.head
        if current:
            while current:
                if current.data == key:
                    return current.data
                current = current.next
        return None

    # initialize a prev node to keep track of the last node
    # if found and its the first element: move the head pointer to the next node
    # if not the first element point the last node's next pointer to the next node
    # if not found the change prev to the current node and the current to the next node
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        current = self.head
        prev = None
        while current:
            if current.data == key:
                if prev:
                    prev.next = current.next
                    return current.data
                else:
                    self.head = current.next
                    return current.data
            prev = current
            current = current.next