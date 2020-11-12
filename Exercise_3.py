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
        if self.head == None:
            self.head = ListNode(data)
        newnode = ListNode(data)
        current = self.head
        while(current.next != None):
            current = current.next
        current.next = newnode
        newnode.next = None
        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        if self.head == None:
            return None
        if self.head.data == key:
            return self.head
        current = self.head
        while(current!= None):
            if current.data == key:
                return current.data
            else:
                current = current.next
        return None
        

        

        
        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        current = self.head
        if current!=None:
            if current.data == key:
                self.head = current.next 
                current = None
                return
        while(current!=None):
            if current.data == key:
                break
            prev = current
            current = current.next 
        if current == None:
            return 
        prev.next = current.next
        current = None