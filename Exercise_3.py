#The given functions are implemented according to the required time complexities being mentioned
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
        if self.head==None:
            self.head=ListNode(data)
        else:
            a=self.head
            while a.next!=None:
                a=a.next
            b=ListNode(data)
            a.next=b
        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        a=self.head
        while a.next!=None:
            if a.data==key:
                return "Found"
            a=a.next
        return "Not Found"
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        a=self.head
        p=None
        if self.head!=None:
            if self.head.data==key:
                self.head=self.head.next
                return 
        while a.next!=None:
            if a.data==key:
                p.next=a.next
                break
            p=a
            a=a.next
        return "Not Found"
