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
        if self.head is None:
            self.head = ListNode(data)
        else:
            while self.head.next != None:
                self.head = self.head.next
            self.head.next = ListNode(data)

        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        if self.head is None:
            return None
        else:
            while self.head != None:
                if self.head.data == key:
                    return self.head.data
        return None    
        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        if self.head is None:
            return None
        currNode = self.head
        prevNode = None
        nextnode = None
        while currNode is not None:
            if currNode.data == key:
                nextnode = currNode.next
                prevNode.next = nextnode
                prevNode = currNode
            else:
                prevNode = currNode
            currNode = currNode.next
