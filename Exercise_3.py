#Time-Complexity: O(n)
#Space-Complexity:- O(n)
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
        if not self.head:
            self.head=new_node
        else:
            current=self.head
            while current.next:
                current=current.next
            current.next=new_node
        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        current=self.head
        while current:
            if current.data==key:
                return current
            current=current.next
        return None
        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        if not self.head:
            return 

        if self.head.data==key:
            self.head=self.head.next
            return

       current=self.head
       while current.next:
           if current.next.data==key:
               current.next=current.next.next
               return 
          current=current.next

 def display(self):
     """
     Display the elements in the list
     """
     elements=[]
     current=self.head
     while current:
         elements.append(str(current.data))
         current=current.next
    print("->".join(elements))
               
