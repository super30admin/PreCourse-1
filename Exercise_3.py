#space = O(n)
class ListNode:
    """
    A node in a singly-linked list.
    """
    def __init__(self, data=None, next=None):
        self.data = data
        self.next = next
    
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
        new = ListNode(data)
        if self.head:
            current = self.head
            while(current.next):
                current=current.next
            current.next = new
        else:
            self.head = new
        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        current = self.head
        while(current.next):
            if current.data ==key:
                return key
        return None
        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        current = self.head

        #if the head has the key
        if(current is not None):
            if (current.data == key):
                self.head = current.next
                current=None
                return

        while (current.next):
            if current.data == key:
                break
            prev=current
            current=current.next

        #if key is not in list
        if (current==None):
            return

        prev.next = current.next