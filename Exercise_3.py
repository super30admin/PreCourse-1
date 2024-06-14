#time complexity O(n)
#space complexity O(1)

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
        current = self.head
        if self.head:
            while current.next:
                current = current.next
            current.next = data
        else:
            self.head = data
        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        current = self.head
        while current != None:
            if current.data == key:
                return current.data
            current = current.next

        return None
        

    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        if self.head == key:
            self.head = self.head.next
            return
        temp = self.head.next
        temp_prev = self.head
        while temp.next is not None:
            if temp.data == key:
                temp_prev.next = temp.next
            temp = temp.next
            temp_prev = temp.next
        return
    