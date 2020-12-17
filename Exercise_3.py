class ListNode:
    """
    A node in a singly-linked list.
    """
    def __init__(self, data=None, next=None):
        self.data=data
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
        new_node = ListNode(new_data)
        if self.head is None: 
            self.head = new_node 
        return
 
        last = self.head 
        while (last.next): 
            last = last.next
 
       
        last.next =  new_node 
        
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
        temp = self.head  
  
        # If head node itself holds the key to be deleted  
        if (temp is not None):  
            if (temp.data == key):  
                self.head = temp.next
                temp = None
                return
  
        # Search for the key to be deleted, keep track of the  
        # previous node as we need to change 'prev.next'  
        while(temp is not None):  
            if temp.data == key:  
                break
            prev = temp  
            temp = temp.next
  
        # if key was not present in linked list  
        if(temp == None):  
            return 
  
        # Unlink the node from linked list  
        prev.next = temp.next
  
        temp = None