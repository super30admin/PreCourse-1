class ListNode:
    """
    A node in a singly-linked list.
    """
    def __init__(self, data=None, next=None):
        self.data = data
        self.next = None
    
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
        NewNode = ListNode(data)

        # If llist is empty, add a newnode and make it as head
        if self.head is None:
            self.head = NewNode
            return
        
        # Traverse till the end and add a newnode
        LastNode = self.head
        while(LastNode.next):
            LastNode = LastNode.next
        
        LastNode.next = NewNode
        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        if self.head is None:
            return 
        
        CurrentVal = self.head

        while CurrentVal is not None:
            if CurrentVal.data == key:
                return CurrentVal.data
            
            CurrentVal= CurrentVal.next
        
        return None
        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        # Storing value of the head node temporarily
        HeadVal = self.head

        # if head node has the key  
        if HeadVal is not None:
           if HeadVal.data == key:
               self.head = HeadVal.next
               HeadVal = None
               return 
        
        # search for the key, change previous node's next value
        while (HeadVal is not None):
            if HeadVal.data == key:
                break
            prev = HeadVal
            HeadVal = HeadVal.next

        # if key not present in llist 
        if HeadVal == None:
            return

        # unlinking
        prev.next = HeadVal.next

        HeadVal = None
