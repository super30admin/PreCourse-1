class ListNode:
       def __init__(self,data,Next=None):
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
        newnode=ListNode(data)
        current=self.head
        while current.Next!= None:
            current=current.Next
        current.Next=newnode
        
        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        self.key=key
        if key>self.length or key<0:
            return None
        elif key==0:
            return self.data

        else:
            return         
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        if self.head == None:
            print('The List is Empty')
        
        temp_node=self.head
        if self.key==0:
            self.head= temp_node.Next
            temp_node=None
            return 
        else:
            return 

### Driver Code 

if __name__ == '__main__': 
    Sllist = SinglyLinkedList()
    Sllist.append(10)
    Sllist.append(15)
    Sllist.append(16)
    Sllist.find(0)



        
       
            
