# Time Complexity : O(N)
# Space Complexity : O(N)

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
        inp=ListNode(data)
        if self.head==None:
            self.head=inp
        else:
            temp=self.head
            while temp.next!=None:
                temp=temp.next
            temp.next=inp
        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        temp=self.head
        while temp.next!=None:
            if key==temp.data:
                return temp.data
            
        return None
        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        cur=self.head
        prev=None
        while cur.next!=None:
            frwd=cur.next
            if cur.data==key:
                if prev==None:
                    self.head=frwd
                else:
                    prev.next=frwd
                cur.next=None
                return cur.data
            prev=cur
            cur=frwd

