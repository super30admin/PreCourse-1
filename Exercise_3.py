class ListNode:
    """
    A node in a singly-linked list.
    """
    def __init__(self, data,next):
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
        if(self.head is None):
            self.head=ListNode(data=int(data),next=None)
        else:
            temp=ListNode(data=int(data),next=None)
            travnode=self.head
            # prevnode=travnode
            print("Prinitng")
            print(self.head.data)
            while(travnode.next is not None):
                print("Inside the loop")
                # prevnode=travnode
                travnode=travnode.next
            travnode.next=temp
            


        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        if(self.head is None):
            print("No element loop")
            return None
            
        
        else:
            travnode=self.head
            while(travnode.next is not None):
                if(travnode.data == key):
                    print("in between loop")
                    return key    
                travnode=travnode.next
            if(travnode.data == key):
                    print("last element")
                    return key
                    
            
            print("No element found loop")
            return None 
        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        if(self.head is None):
            return None
        else:
            travnode=self.head
            if(travnode.next is None):
                if(travnode.data == key):
                    self.head=None
                    return key
            else:
                travnode=self.head
                prevnode=None
                
                while(travnode.next is not None):
                    
                    if(travnode.data == key):
                        print("match")
                        if(prevnode is None):
                            
                            self.head=travnode.next
                            
                            return key
                        else:
                            prevnode.next=travnode.next
                            return key
                         
                         
                    prevnode=travnode
                    travnode=travnode.next
                if(travnode.data == key ):    
                    prevnode.next=travnode.next
                    return key
                # while(travnode.next is not None):
                #     if(self.head.data == key):
                #         prevnode.head.next=self.head.next
                #         return key
                #     prevnode=self
                #     self.head=self.head.next
            return None 
    
    def traverse(self):
        
        if(self.head is None):
            return print("Empty")
        travnode=self.head
        while(travnode.next is not None ):
          
            print(str(travnode.data) )
            travnode=travnode.next
        
        print(str(travnode.data) )

           


            
a_LL = SinglyLinkedList()
while True:
    #Give input as string if getting an EOF error. Give input like "push 10" or "pop"
    print('append <value>')
    print('find <value>')
    print('remove <value>')
    print('quit')
    do = input('What would you like to do? ').split()
    #Give input as string if getting an EOF error. Give input like "push 10" or "pop"
    operation = do[0].strip().lower()
    if operation == 'append':
        a_LL.append(int(do[1]))
    elif operation == 'find':
        found = a_LL.find(int(do[1]))
        if found is None:
            print('Not found.')
        else:
            print('found value: ', int(found))
    elif operation == 'remove':
        removed = a_LL.remove(int(do[1]))
        if removed is None:
            print('Not found.')
        else:
            print('removed value: ', int(removed))
    elif operation == 'traverse':
        a_LL.traverse()
    elif operation == 'quit':
        break
