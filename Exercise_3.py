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
        if(self.head == None):
            self.head = ListNode(data)
            return self.head
        temp = self.head
        
        while(temp and temp.next):
            temp = temp.next
        temp.next = ListNode(data)
        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        if(self.head == None):
            return None
        temp = self.head
        while(temp):
            if(temp.data == key):
                return key
            temp = temp.next
        return None
            
        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        temp = self.head
        if(temp.data == key):
            self.head = temp.next
            return self.head
        previous = temp
        temp = temp.next
        while(temp):
            if(temp.data == key):
                previous.next = temp.next
                return self.head
            previous = temp
            temp = temp.next
