#time complexity:O(n)
  #space complexity:O(n)
class ListNode:
    """
    A node in a singly-linked list.
    """
    
    def __init__(self, data=None, next=None):
        self.data= data
        self.next= next
    
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
        newnode=ListNode(data)
        current= newnode
        if(self.head):
                current = self.head
                while(current.next):
                  current = current.next
                current.next = newnode
        else:
               self.head = newnode

        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        if(self.head):
                current = self.head
                while(current.next):
                  if(current.next== None):
                      return None
                  if(current.data == key): 
                    return current.data
                  else:
                      current=current.next
            

        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        if(self.head):
                current = self.head
                while(current.next):
                  if(current.next== None):
                      return None
                  if(current.data == key): 
                    current.next= current.next
                
