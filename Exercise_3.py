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
        dummy=ListNode(data)
        if (self.head is None):
            self.head=dummy
        else:
            temp=self.head
            while(temp.next):
                temp=temp.next
            temp.next=dummy
        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        temp=self.head
        while(temp):
            if(temp.data==key):
                return key
            else:
                temp=temp.next
        return None
        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        previous=ListNode(0)
        previous.next=self.head
        current=self.head
        nxt=current.next
        while(nxt):
            if(key==current.data):
                previous.next=nxt
                current.next=None
                return self.head
            else:
                previous=current
                current=nxt
                nxt=nxt.next
        if (key==current.data):
            previous.next=nxt
            current.next=None
            return self.head
        else:
            previous=current
            current=nxt
            nxt=nxt.next

