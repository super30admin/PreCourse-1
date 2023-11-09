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
        if self.head is None:
            self.head=ListNode(data,self.head)
            return
        
        itr=self.head
        while itr.next:
            itr=itr.next
        
        itr.next=ListNode(data,None)
        


        

        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        if self.head is None:
            return None
        
        itr=self.head
        result=None
        while itr:
            if itr.data==key:
                result=itr.data
            itr=itr.next
        
        return result

    

        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        if self.head is None:
            return
        
        itr=self.head
        if itr.data==key:
            itr=itr.next
        while itr:
            if itr.next.data==key:
                itr.next=itr.next.next
                break
                
            itr=itr.next

