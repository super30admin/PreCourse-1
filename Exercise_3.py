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
        newNode = ListNode(data, None)
        #If first node to be inserted, insert at head
        if self.head is None:
            self.head = newNode
            return
        
        # If not first node, traverse until you reach end of list
        # and then insert at end
        curr = self.head
        while curr.next:
            curr = curr.next
        
        curr.next = newNode
        newNode.next = None

        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        if self.head is None:
            return None
        
        if self.head.next is None and self.head.data == key:
            return self.head

        curr = self.head
        while curr.next:
            if curr.data == key:
                return curr
            
            curr = curr.next

        return None
        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        if self.head is None:
            return
        
        if self.head.next is None and self.head.data == key:
            self.head = None
            return

        prev = None
        curr = self.head
        while curr.next:
            if curr.data == key:
                prev.next = curr.next
                curr.next = None
                return

            prev = curr
            curr = curr.next