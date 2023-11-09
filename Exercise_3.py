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
            return 
        endNode = self.head
        while(endNode):
            endNode = endNode.next
        endNode = newNode
        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        temp = self.head
        while (temp != None):
            if temp.data == key:
                return True
        return False
        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        temp = self.head
        if(temp != None):
            if(temp.data == key):
                nodeToDelete = self.head
                self.head = self.head.next
                nodeToDelete = None
            else:
                while(temp.next != None):
                    if(temp.next.data == key):
                        nodeToDelete = temp.next
                        temp.next = temp.next.next
                        nodeToDelete = None
                        break
                    temp = temp.next





