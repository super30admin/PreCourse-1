class ListNode:
    """
    A node in a singly-linked list.
    """
    def __init__(self, data=None, next=None):
        self.val = data
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
        current = self.head
        if not current:
            self.head = new_node
        else:
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
            if current.val == key:
                return current.val
            current = current.next
        return

    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        deleted = False
        current = self.head
        prev = current
        if self.head.val == key: # edge case. handle head assignment separately
            self.head = current.next
            deleted = True
        while current: # for the rest of the nodes
            if current.val == key:
                prev.next = current.next
                deleted = True
                break
            prev = current
            current = current.next
        return deleted

'''
n = number of nodes in the linkedlist
Space Complexity: O(n)

Time Complexity:
satisfies per requirement
'''