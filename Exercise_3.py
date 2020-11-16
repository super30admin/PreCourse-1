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
        newNode =ListNode(data,self.head)
        self.head = newNode
        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """


        current = self.head 
  
        # loop till current not equal to None 
        while current != None: 
            if current.data == key: 
                return current.data # data found 
              
            current = current.next
          
        return None # Data Not found 
        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """

        if self.head.data == key:
            nextNode = self.head.next
            self.head.next = None
            self.head = nextNode
        else:
            prev = None
            current = self.head
            while(current):
                if current.data == key:
                    prev.next = current.next
                    break
                else:
                    prev = current
                    current = current.next
