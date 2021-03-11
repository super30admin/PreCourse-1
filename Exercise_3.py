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
        node=ListNode(data)
        temp=self.head
        if self.head is None: 
            self.head = node 
            return
        while(temp.next!=None):
            temp=temp.next
        temp.next=node
        node.next=None
        
            
            
            
        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        temp=self.head
        while(temp.next!=None):
            if(temp.data==key):
                return temp.data
            temp=temp.next
        print("No matching data")
        #return None
       
        
        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        temp=self.head
        while(temp.next!=None):
            if(temp.next.data==key):
                temp.next=temp.next.next
                return
                
            temp=temp.next
        return 
linklist = SinglyLinkedList() 
linklist.append(6)
linklist.append(7)
linklist.find(6)
linklist.remove(7)
print(linklist.find(7))
  
   
    