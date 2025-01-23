class ListNode:
    """
    A node in a singly-linked list.
    """
    def __init__(self, data, next):
        self.data = data
        self.next=None
    
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
        node =  ListNode(data)
        if not self.head:   # None anedhi default ga null vuntundhi
           self.head=node
        else:
            #now we have to traverse to the end of the array
            curr = self.head
            while curr.next:
                curr = curr.next
            curr.next= node
    
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        curr =  self.head
        while curr:
            if curr.head == key:
                return True
            curr = curr.next
        return False

        
        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        curr  = self.head
        prev = None

        while curr:
            if curr.data == key:
                if previous is None:
                    self.head = curr.next
                else:
                    previous.next = curr.next
                return True
            previous = curr
            curr = curr.next
        return False
       