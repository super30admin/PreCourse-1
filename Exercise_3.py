class ListNode:
    """
    A node in a singly-linked list.
    """
    def __init__(self, data=None, next=None):
    
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
        newNode=Node(data)
        newnode.next=self.head
        self.head=newNode
        
        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        current=self.head
        found=False
        while current and found is False:
            if current.data==key:
                found=Trueloo
            else:
                current=current.next
        if current is None:
            return ("Data is not in list")
            
        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        current=self.head
        previousNode=None
        while current is not None:
            if current== key:
                if previousNode is not None:
                    previousNode.next=current.next
                else:
                    self.head=current.next
                    
            previousNode=current
            current=current.next
            
