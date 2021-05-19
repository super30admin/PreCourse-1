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
        n = ListNode(data)
        if self.head is None:
            self.head = n
            return
        
        temp = self.head
        while(temp.next):
            temp=temp.next
        temp.next = n

        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """

        temp = self.head
        if self.head is None:
            return None
        while(temp):
            if temp.data == key:
                return temp.data
            temp=temp.next
        return None


        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        temp = self.head      
        while(temp.data!=key):
            temp = temp.next
        temp.data=temp.next.data
        temp.next=temp.next.next



