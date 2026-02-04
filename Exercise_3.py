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
        new = ListNode(data)
        if self.head == None:
            self.head = new
            new.next = None
        curr = self.head
        while curr.next != None:
            curr = curr.next
        curr.next = new
        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        curr = self.head
        while curr != None:
            if curr.data == key:
                return curr
        return None

    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        if self.head == key:
            self.head = self.head.next
            return
        prev = self.head
        curr = self.head.next
        while curr.next != None:
            if curr.data == key:
                prev.next = curr.next
            prev = prev.next
            curr = curr.next



