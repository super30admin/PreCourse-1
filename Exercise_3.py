

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
        n_node=ListNode(data)

        if self.head ==None:
            self.head=n_node
            return
        
        cur=self.head
        while cur.next!=None:
            cur=cur.next
        cur.next=n_node
       

        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        temp=self.head
        
        while temp:
            
            if temp.data==key:
                return temp
            temp=temp.next
    
        return None






        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        
        temp=self.head
        prev=None
        while temp:
            if temp.data==key:
                if prev is None:
                    self.head = temp.next
                else:
                    prev.next=temp.next
                break
            prev=temp
            temp=temp.next

        
       

