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
        if self.head == None: #ie if the LL is blank then this we become the 1st elem
            self.head=ListNode(data)
            return

        itr = self.head
        while itr.next:
            itr= itr.next

        itr.next = ListNode(data)
        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        if self.head == None: #ie if the LL is blank then this we become the 1st elem
            return
        
        itr = self.head
        while itr.next:
            if key == itr.data:
                return itr.data
            itr = itr.next
        
        return itr.data
        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        if self.head == None: #ie if the LL is blank then this we become the 1st elem
            return
        
        itr = self.head
        if itr.data == key:
            self.head = self.head.next

        while itr.next:
            if key == itr.next.data:
                itr.next = itr.next.next
                break
            itr = itr.next