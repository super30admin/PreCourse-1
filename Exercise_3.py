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
        self.cur=None

    def append(self, data):
        """
        Insert a new element at the end of the list.
        Takes O(n) time.
        """
        node=ListNode(data)
        if  self.cur==None:
            self.cur=node
            self.head=self.cur
        else:
            self.cur.next=node
            self.cur=self.cur.next
    
        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        self.first=self.head
        while self.first!=None:
            if self.first.data==key:
                return self.first.data
            self.first=self.first.next
            
        return self.first
        

        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        
        if self.head.data==key:
            self.head=self.head.next
            return
        
        self.first=self.head
        self.prev=self.head   
        while self.first!=None:
            if self.first.data==key:
                self.prev.next=self.first.next
                break
            self.prev=self.first
            self.first=self.first.next
#Test data         
s_SinglyLinkedList=SinglyLinkedList()
s_SinglyLinkedList.append(1)
s_SinglyLinkedList.append(2)
s_SinglyLinkedList.append(3)
print(s_SinglyLinkedList.find(1))
s_SinglyLinkedList.remove(2)
print(s_SinglyLinkedList.find(2))
s_SinglyLinkedList.remove(1)
print(s_SinglyLinkedList.find(1))
print(s_SinglyLinkedList.find(3))
