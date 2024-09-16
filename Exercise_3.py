class ListNode:
    """
    A node in a singly-linked list.
    """
    def __init__(self, data=None, next=None):
        self.data = data
    
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
        temp = ListNode(data)

        if not self.head:
            self.head = temp
            return
        
        cur = self.head
        while cur.next:
            cur = cur.next

        cur.next = temp
        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        cur = self.head

        while cur:
            if cur.data == key:
                return cur
            cur = cur.next

        return None
        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        cur = self.head
        prev = None

        while cur:
            if cur.data == key:
                if prev == None and self.head == cur:
                    self.head = None
                else:
                    prev = cur
                    cur = cur.next
                    prev.next = cur
