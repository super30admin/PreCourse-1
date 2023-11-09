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
        new=ListNode(data)
        if self.head==None:
            self.head=new
            return
        lastnode=self.head
        while lastnode.next:
            lastnode=lastnode.next
        lastnode.next=new
        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        findnode=self.head
        found=False
        while findnode and found is False:
            if findnode.data==key:
                found=True
                return findnode
            else:
                findnode=findnode.next
            if findnode is None:
                return None
            
        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        findnode=self.head
        previous=None

        while findnode:
            if findnode.data==key:
                if previous:
                    previous.next=findnode.next
                else:
                    self.head=findnode.next
            previous=findnode
            findnode=findnode.next
