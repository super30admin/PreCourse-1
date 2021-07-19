from _typeshed import SupportsLessThan


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
        
        temp=self.head
        if self.head is None:
            return ListNode(data)
        while(temp!=None):
            temp=temp.next
        temp.next=ListNode(data)
        return self.head
        
        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        curr=self.head
        while(curr!=None):
            if(curr.data==key):
                return curr.data
            curr=curr.next
        return None
            
        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        curr=self.head
        prev=None
        while (curr!=None):
            if(curr.data==key):
                prev.next=curr.next
                curr.next=None
            prev=curr
            curr=curr.next