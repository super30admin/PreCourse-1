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
        self.head = ListNode()

    def append(self, data):
        """
        Insert a new element at the end of the list.
        Takes O(n) time.
        """
        if self.head.data==None:
            self.head=ListNode(data)
            
        else:
            newNode=ListNode(data)
            pre=self.head
            while pre.next:
                pre=pre.next
            pre.next=newNode
    
            
        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        travel=self.head
        while travel:
            if travel.data==key:
                return travel
            travel=travel.next


        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        prev=None
        travel=self.head
       
            
        while travel and travel.next:
            if travel.data==key:
                if prev==None:
                    self.head=self.head.next
                else:
                    prev.next=travel.next
            prev=travel 
            travel=travel.next