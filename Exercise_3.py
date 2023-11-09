class ListNode:
    """
    A node in a singly-linked list.
    """
    def __init__(self, data=None, next=None):
        self.Data = data
        self.Next = next
    
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
        temp = self.head
        if not temp: self.head = ListNode(data)
        while temp:
            if not temp.Next: temp.Next = ListNode(data)
            temp = temp.Next
        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        temp = self.head
        while temp:
            if temp.Data == key: return key
            temp = temp.Next
        return None
        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        if self.head.Data == key: 
            self.head = self.head.Next
            return

        temp = self.head
        while temp:
            if temp.Data == key: return key
            temp = temp.next
        return None
