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
        newnode=ListNode(data)

        if self.head is None:
            self.head=newnode

        else:
            ptr=self.head
            while ptr.next:
                ptr=ptr.next
            ptr.next=newnode

        
        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        ptr=self.head
        while ptr:
            if ptr.data==key:
                return ptr.data
            ptr=ptr.next
        return -1

    def getprev(self,key):


    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        ptr=self.head
        prev=None
        while ptr!=None and ptr.data==key: #If key is in head
            self.head=temp.next
            ptr=self.head
        
        if ptr:
            while (ptr and ptr.data!=key):
                prev=ptr
                ptr=ptr.next

            if ptr is None: #if key is not LL
                return self.head

            prev.next=ptr.next
            ptr=prev.next

        return self.head


        
            


