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
        newNode = ListNode(data)
        if self.head == None:
            self.head = newNode
        else:
            navigateNode = self.head
            while navigateNode.next:
                navigateNode = navigateNode.next
        
            navigateNode.next = newNode

        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        navigateNode = self.head
        while navigateNode:
            if navigateNode.data == key:
                return navigateNode
            navigateNode = navigateNode.next
        
        return None
        
        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        navigateNode = self.head
        prev = None
        while navigateNode:
            if navigateNode.data == key:
                if prev == None:
                    navigateNode = navigateNode.next
                else:
                    prev.next = navigateNode.next
            prev = navigateNode
            navigateNode = navigateNode.next