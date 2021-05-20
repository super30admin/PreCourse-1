class ListNode:
    """
    A node in a singly-linked list.
    """
    def __init__(self, data=None, next=None):
        self.data=None
        self.next=None
    
class SinglyLinkedList:
    def __init__(self):
        """
        Create a new singly-linked list.
        Takes O(1) time.
        """
        self.head = None
        self.size=0

    def append(self, data):
        """
        Insert a new element at the end of the list.
        Takes O(n) time.
        """
        node=ListNode(data)
        current=self.head
        for i in range(self.size):
            current=current.next
            current.next=node



        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        current = self.head
        for i in range( self.size ):

            if(current.data==key):

                    return current
            current = current.next
            current.next = node

        return None

        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        current = self.head
        if (self.head.data==key):
            self.head=current.next

        for i in range( self.size ):

            if (current.next.data == key):
                current.next=current.next.next
                break

            current = current.next

