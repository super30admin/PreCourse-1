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
        newNode = ListNode(data=data)
        if not self.head:
            self.head = newNode #list was empty, so make this the head
            return
        
        currNode = self.head

        while currNode.next != None:
            currNode = currNode.next
        
        currNode.next = newNode # add this node to the end

        
        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        currNode = self.head

        while currNode != None:
            if currNode.data == key:
                return currNode
            currNode = currNode.next

        return None
        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        currNode = self.head
        prevNode = None

        while currNode != None:
            if currNode.data == key:
                if prevNode:
                    prevNode.next = currNode.next
                else:
                    self.head = currNode.next #since we are still at the head
                return
            prevNode = currNode
            currNode = currNode.next
