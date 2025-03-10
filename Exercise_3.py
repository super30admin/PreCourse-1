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
        lnode = ListNode(data)
        if self.head == None:
            self.head = lnode
        else:
            curr = self.head
            while curr.next:
                curr = curr.next
            curr.next = lnode
        
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
        prev = None
        cur = self.head
        while cur:
            if cur.data == key:
                if prev == None:
                    self.head = self.head.next
                else:
                    prev.next = cur.next
                break
            else:
                prev = cur
                cur = cur.next