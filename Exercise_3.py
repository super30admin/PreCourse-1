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
        self.cur_ptr = None

    def append(self, data):
        """
        Insert a new element at the end of the list.
        Takes O(1) time.
        """
        temp = ListNode(data)
        self.cur_ptr.next = temp
        self.cur_ptr = temp
        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        traversal = self.head
        while traversal!=None:
            if traversal.data == key:
                return traversal.data
            traversal = traversal.next
        return None
        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        # remove head
        if self.head.data == key:
            self.head = self.head.next
        # remove intermediate node
        else:
            traversal = self.head
            while traversal.next != None and traversal.next.data != key:
                traversal = traversal.next
            if traversal.next!=None:
                traversal.next = traversal.next.next

