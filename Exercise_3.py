class ListNode:
    """
    A node in a singly-linked list.
    """
    def __init__(self, data=None, next=None):
    
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
        if not self.head:
            self.head = ListNode(data=data)
            return
        currentNode = self.head
        while currentNode.next:
            currentNode = currentNode.next
        currentNode.next = ListNode(data=data)

        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        currentNode = self.head
        while currentNode and currentNode.data != key:
            currentNode = currentNode.next
        return currentNode
        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        currentNode = self.head
        prev = None
        while currentNode and currentNode.data != key:
            prev = currentNode
            currentNode = currentNode.next
        if prev is None:
            self.head = currentNode.next
        elif currentNode:
            prev.next = currentNode.next
            currentNode.next = None