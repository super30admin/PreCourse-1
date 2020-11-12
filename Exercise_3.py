class ListNode:
    """
    A node in a singly-linked list.
    """
    def __init__(self, data=None, next=None):
        self.data=data
        self.next=next
    
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
        if (self.head==None): # If list is empty than assign value of head is new node   
            self.head=new_node
            return
        end=self.head # If list contains nodes end variable is initialized with head 
        while(end.next): # traversing the list and reaching till end/last node 
            end=end.next # setting reference of last node to new node
        end.next=new_node
            
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        element=self.head
        while(element!=None): #Traversing to check if requested key is found at each current node or not
            if (element.data==key): 
                return element.data
            else:
                element=element.next

            if (element==None):
                return element  
        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        element=self.head     
        previouselement=None
        if(element!=None): # if head contains key/element 
            if (element.data==key):
                self.head=element.next
                element=None
                return
        while(element!=None):
            if (element.data==key):
                break
            previouselement=element
            element=element.next
        if element == None: # if key/element is not present
                return 'Record not found'
        previouselement.next=element.next
        element=None
    
        """
       Traversing the list
        """
    def show(self):  
        temp = self.head  
        while(temp):  
            print (" %d" %(temp.data)),  
            temp = temp.next


#linked_list = ListNode()
linked_list=SinglyLinkedList()
linked_list.append(1)
linked_list.append(2)
linked_list.append(3)
linked_list.append(4)
linked_list.append(5)
linked_list.append(6)
linked_list.append(7)
print('Linked List before before deletion')
linked_list.show()
linked_list.remove(5)
print('Linked List before after deletion')
linked_list.show()
result=linked_list.find(7)
print('Element',result)
linked_list.remove(7)
linked_list.show()
result=linked_list.find(7)
print('Element',result)







