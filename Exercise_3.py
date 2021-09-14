# Singly Linked List

class ListNode:
    """
    A node in a singly-linked list.
    """
    def __init__(self, data=None, next=None):
        self.data= data
        self.next= None
    
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
        newnode= Node(data)
        if self.head is None:
            self.head= newnode
            return
        last= self.head
        while last.next:
            last=last.next
        last.next=newnode
        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        current=self.head
        
        while current!=None:
            if current.data==key:
                return current
            current=current.next
        return None
    
        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        tail=self.head
        if tail.data==key:
            self.head= tail.next
            return 
        while tail.next is not None and tail.next.data !=key:
            tail=tail.next
        if tail.next== None:
            print("element is not in the list")
            return
        tail.next= tail.next.next
        return
