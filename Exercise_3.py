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
        if self.head == None:
            self.head = ListNode(data)
            #self.head.data = data
        else:
            newNode = ListNode(data)
            #newNode.next = None
            tmp = self.head
            while tmp.next:
                tmp = tmp.next
            tmp.next = newNode
        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        tmp = self.head
        while tmp:
            if tmp.data == key:
                return tmp
            tmp = tmp.next
        return None
        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        if self.head.data == key:
            tmp = self.head
            self.head = self.head.next
            tmp.next = None
        else:
            tmp = self.head
            while tmp.next.data != key:
                tmp = tmp.next
            tmp.next = tmp.next.next
