class ListNode:
    """
    A node in a singly-linked list.
    """
    def __init__(self, data=None, next=None):
        self.value=value
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
        temp=ListNode(data)
        if self.head==None:
            self.head=temp
            return
        curr=self.head
        while curr.next!=None:
            curr=curr.next
        curr.next=temp
        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        curr=self.head
        while curr!=None and curr.data!=key:
            curr=curr.next
        return curr
        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        curr=self.head
        prev=None
        while curr!=None and curr.value!=key:
            prev=curr
            curr=curr.next
        
        if prev==None:
            self.head=None
        elif curr!=None:
            prev.next=curr.next
