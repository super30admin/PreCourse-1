#did not do on leetcode
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
        new_node=ListNode(data)
        if not self.head: #checking if it is  head 
            self.head=new_node #updating head to new value
        
        
        current=self.head
        #traverse to last
        while current.next:
            current=current.next
        current.next=new_node  #then add the value      
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.

        """
        current=self.head
        while current: #traveersing
            if current.data==key: #check if data == the key value
                return current
            current=current.next
            return None
            
            
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """

        prev=None
        current=self.head
        while current:  #traversing
            if current.data==key: #checkinf if key
                if prev:
                    prev.next=current.next #previous will skip the iteration by traversing twice
                else:
                    self.head=current.next #head will skip the iteration by traversing 
                return
            prev=current
            current=current.next

            
        

    