class ListNode:
    """
    A node in a singly-linked list.
    """
    def __init__(self, data, next=None):
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
        Space Complexity: O(1) — no extra space used apart from adding the new node.
        """
        new_node = ListNode(data)
        if self.head is None:
            self.head = new_node
        else:
            tail = self.head
            while tail.next:
                tail = tail.next
            tail.next = new_node
        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        Space Complexity: O(1)
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
        Space Complexity: O(1)
        """
        curr = self.head

        if curr is None:
            return

        if curr.data == key:
            self.head = curr.next
            return

        while curr.next:
            if curr.next.data == key:
                curr.next = curr.next.next
                return
            curr = curr.next
