#Implement Singly Linked List.
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
            self.head.data=data
            self.head.next=None
        else:
            NewNode=ListNode(data)
            Old_Head=self.head
            while Old_Head.next:
                Old_Head=Old_Head.next
            Old_Head.next=NewNode
        #self.head.next=None
        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        if self.head.data==None:
            return None
        else:
            Old_Head=self.head
            while Old_Head.next:
                if Old_Head.data==key:
                    return Old_Head
                Old_Head=Old_Head.next
        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        Old_Head=self.head
        prev=None
        while Old_Head.next:
            if Old_Head.data==key:
                if prev==None:
                    self.head=Old_Head.next
                else:
                    prev.next=Old_Head.next
                    Old_Head.next=None
            Old_Head=Old_Head.next
            prev=Old_Head
            
                
