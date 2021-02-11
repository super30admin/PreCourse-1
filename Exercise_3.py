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
        if self.head==None:
            self.head=ListNode(data)
        else:
            curnode=self.head
            newNode=ListNode(data)
            
            while curnode.next!=None:
                
                curnode.next=newNode
                curnode=curnode.next
                
        
        
        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        curnode=self.head
        while True:
            if curnode.data==key:
                return curnode.data
                break
            else:
                curnode=curnode.next
        return "None"
        
        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        curnode=self.head
        if curnode.data==key:
            self.head==None
        
        while True:
            if curnode.data==key:
                prevnode.next=curnode.next
                del curnode
            prevnode=curnode
            curnode=curnode.next
                
                
                

