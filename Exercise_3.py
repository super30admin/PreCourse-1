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
        node = ListNode(data)
        if self.head is None:
            self.head = node
            return
        temp_iter = self.head
        while temp_iter.next:
            temp_iter = temp_iter.next
        temp_iter.next = node
        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        temp_iter = self.head
        while temp_iter:
            if temp_iter.data == key:
                return temp_iter.data
            temp_iter = temp_iter.next
        return None
            
            
        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """

        temp_iter = self.head
        prev_iter = None
        while temp_iter:
            if temp_iter.data == key:
                if prev_iter:
                    prev_iter.next = temp_iter.next
                else:
                    self.head = temp_iter.next
                return
            prev_iter = temp_iter
            temp_iter = temp_iter.next

