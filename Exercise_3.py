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
        new_node=ListNode(data)
        if self.head is None: 
            self.head = new_node 
        else: 
           end = self.head 
           while (end.next): 
               end = end.next
           end.next =  new_node 
            
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        temp=self.head
        if temp==None:
            return None
        while temp!=None:
            if temp.data==key:
                return temp.data
            else:
                temp=temp.next

        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        temp=self.head
        # if key was not present in linked list  
        if(temp == None):  
            return

        # Store head node  
        temp = self.head  
  
        # If head ==key   
        if temp!=None:  
            if (temp.data == key):  
                self.head = temp.next
                temp = None
                return
  
        # Search for the key to be deleted, keep track of the  
        # previous node as we need to change 'previous.next'  
        while temp!=None:  
            if temp.data == key:  
                break
            previous = temp  
            temp = temp.next
  
        # Unlink the node from linked list  
        previous.next = temp.next
  
        temp = None
    
    def displayLinkedlist(self):
        temp = self.head  
        while(temp):  
            print (temp.data)
            temp = temp.next

llist = SinglyLinkedList() 
llist.append('1')
llist.append('2')
llist.append('3')
llist.append('4')
llist.displayLinkedlist()
llist.remove('2')
print("After deletion ")
llist.displayLinkedlist()
llist.find('3')