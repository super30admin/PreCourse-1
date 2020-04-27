class ListNode:
    """
    A node in a singly-linked list.
    """
    def __init__(self, data=None, next=None):
        self.data=data
        self.next=next

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
            self.head=ListNode(data)
            return
        node=self.head
        while node.next:
            temp=node.next
        node.next=ListNode(data)

    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        node=self.head
        while node:
            if node.data==key:
                return  node
            if node.next:
                node=node.next
        return None

    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        node=self.head
        if not self.head:
            return
        if self.head.data==key:
            self.head=self.head.next
            return
        while node.next:
            if node.next.data==key:
                node.next=node.next.next
                return
            node=node.next
