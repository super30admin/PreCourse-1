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

    def push(self,data):
        newnode=ListNode(data)
        newnode.next=self.head
        self.head=newnode
        

    def append(self, data):
        """
        Insert a new element at the end of the list.
        Takes O(n) time.
        """
        if self.head is None:
            self.head=ListNode(data)
        else:
            current=self.head
            while current.next is not None:
                current=current.next
            current.next=ListNode(data)
                
        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        current=self.head
        while current:
            if current.data==key:
                return True
            current=current.next
        return False
            
            
        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        temp=self.head

        if(temp is not None):
            if (temp.data==key):
                self.head=temp.next
                temp=None
                return
        while(temp is not None):
            if temp.data==key:
                break
            prev=temp
            temp=temp.next

        if(temp==None):
            return

        prev.next=temp.next
        temp=None

        '''
        current=self.head
        if key==0:
            self.head=current.next
            current=None
            return
        prev=None
        count=1
        while current and count!=key:
            prev=current
            current=current.next
            count=count+1
        if current is None:
            return

        prev.next=current.next
        current=None
        '''

    def printlist(self):
        temp=self.head
        while(temp):
            print(temp.data)
            temp=temp.next

s=SinglyLinkedList()

