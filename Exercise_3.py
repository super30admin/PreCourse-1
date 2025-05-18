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
        nodenew=ListNode(data)
        if self.head is None:
            self.head=nodenew
            return
        n=self.head
        while n.next:
            n=n.next
        n.next=nodenew
        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        n=self.head
        while n:
            if n.data==key:
                return n
            n=n.next
        return None
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        n=self.head
        p=None
        while n:
            if p.data==key:
                if p is None:
                    self.head=n.next
                else:
                    p.next=n.next
                return
            p=n
            n=n.next