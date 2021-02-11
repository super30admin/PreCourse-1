class ListNode:
    """
    A node in a singly-linked list.
    """
    def __init__(self, data=None, next=None):
        self.data=none
        self.next=none
        

class SinglyLinkedList:
    def __init__(self):
        """
        Create a new singly-linked list.
        Takes O(1) time.
        """
        self.head = None 
        self.size=0

    def append(self, data):
        """
        Insert a new element at the end of the list.
        Takes O(n) time.
        """
        n1=ListNode(data)
        if self.head is none:
            self.head = n1 
        else:
            i=self.head
            while self.head.next is not None:
                self.head = self.head.next
            self.head.next = n1
        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        #check if ll is empty
        if self.head is not None:
            while self.head.next is not None:
                if self.head.data==key:
                    return self.head.data
                else:
                    self.head = self.head.next
        else:
            print ("Linked list is empty")
            
        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        if self.head is not None:
            while self.head.next is not None:
                if self.head.data==key:
                    self.head.prev=self.head.next
                else:
                    self.head = self.head.next
        else:
            print ("Linked list is empty")
                    
