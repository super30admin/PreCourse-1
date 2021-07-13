'''
Implement Singly-Linked List
'''
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
        self.head = ListNode()
        self.tail = self.head

    def append(self, data):
        """
        Insert a new element at the end of the list.
        Takes O(n) time.
        """
        self.tail.next = ListNode(data)
        self.tail = self.tail.next
        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        cur = self.head.next
        while cur:
            if cur.data == key:
                return cur
            cur = cur.next
        return
        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        prev, cur = self.head, self.head.next
        while cur:
            if cur.data == key:
                prev.next = prev.next.next
                return 
            prev, cur = prev.next, cur.next
