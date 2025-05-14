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
        if self.head == None:
            self.head = ListNode(data,None)
            return
        myhead = self.head
        while myhead.next != None:
            myhead = myhead.next 
        node = ListNode(data,None)
        myhead.next = node

        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        myhead = self.head

        while myhead != None:
            if myhead.data == key:
                return myhead
            myhead = myhead.next 
        return None
        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        
        prev = None

        myhead = self.head

        while myhead is not None:
            if myhead.data == key:
                if prev == None:
                    self.head = myhead.next
                else:
                    prev.next = myhead.next
                return
            prev = myhead
            myhead = myhead.next


