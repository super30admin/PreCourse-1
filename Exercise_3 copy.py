from nntplib import NNTPPermanentError


class ListNode:
    """
    A node in a singly-linked list.
    """
    def __init__(self, data):
        self.data=data
        self.next=None
    def __repr__(self):
        return repr(self.data)
    
class SinglyLinkedList:
    def __init__(self):
        """
        Create a new singly-linked list.
        Takes O(1) time.
        """
        self.head = None

    def append(self, data):
        #if self.head
        """
        Insert a new element at the end of the list.
        Takes O(n) time.
        """
        new_node=ListNode(data)
        if self.head==None:
            self.head=new_node
            print(self.head)
        else:
            temp=self.head
            while(temp.next):
                temp=temp.next
            temp.next=new_node
            print(temp.next)
        
    def find(self, key):
        if self.head==None:
            return None
        else:
            temp=self.head
            while(temp.next):
                if temp.data==key:
                    return True
                temp=temp.next
            return False
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        
    def remove(self, key):
        temp=self.head
        if(temp != None):
            if(temp.data==key):
                self.head=temp.next
                temp=None
        while(temp!=None):
            if (temp.data==key):
                break
            prev=temp
            temp=temp.next
        if (temp==None):
            print('Linked List is Empty')
            return None
        
        prev.next=temp.next
        temp=None
        
                
                     
        
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        

if __name__ == "__main__":
    stack_ops=SinglyLinkedList()
    stack_ops.append(2)
    #stack_ops.append(22)
    print(stack_ops.remove(22))
    #stack_ops.append(33)
    #print(stack_ops.find(29))
    
    