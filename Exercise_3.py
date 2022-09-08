class ListNode:
    """
    A node in a singly-linked list.
    """

    # Each node has data and a pointer to the next node
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

    # Time Complexity: O(N)
    # Space Complexity: O(1)
    def append(self, data):
        """
        Insert a new element at the end of the list.
        Takes O(n) time.
        """
        new_node = ListNode(data)
        # If linked list is empty, the new node will be head.
        if self.head is None:
            self.head = new_node
            return

        # We need to traverse to the end of the linked list to append a node at the end.
        temp = self.head
        while temp.next is not None:
            temp = temp.next
        temp.next = new_node

    # Time Complexity: O(N)
    # Space Complexity: O(1)
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        # If linked list is empty, nothing to find.
        if self.head is None:
            return None

        # Need to check till the end of the linked list for the key.
        temp = self.head
        while temp is not None:
            if temp.data == key:
                return temp
            temp = temp.next
        return None

    # Time Complexity: O(N)
    # Space Complexity: O(1)
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        # If linked list is empty, nothing to remove.
        if self.head is None:
            return

        # If data of head is the key, then we need to remove this head and the next node becomes the
        # new head.
        if self.head.data == key:
            self.head = self.head.next

        # We traverse the entire list to find the key and return "Key not found" if we do not find the
        # key even after checking all nodes.
        else:
            temp = self.head
            while temp is not None:
                if temp.next is None:
                    return "Key not found"
                if temp.next.data == key:
                    temp.next = temp.next.next
                    return
                temp = temp.next