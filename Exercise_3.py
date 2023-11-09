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
        current = self.head
        if current:
            while current.next != None:
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
        curr = self.head
        while curr:
            if curr.data == key:
                return True
            else:
                curr = curr.next
        return False
        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        prev = None
        curr = self.head
        while curr:
            if curr.data == key:
                if prev:
                    prev.next = curr.next
                else:
                    self.head = curr.next()
                return True
        
            prev = curr
            curr = curr.next
        
        return False
