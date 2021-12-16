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
    
    def show(self):
        printval = self.head
        while(printval is not None):
            print(printval.data)
            printval = printval.next
        


    def append(self, data):
        """
        Insert a new element at the end of the list.
        Takes O(n) time.
        """
        Newnode = ListNode(data)
        if self.head is None:
            self.head = Newnode
            return
        currentNode = self.head
        while(currentNode.next):
            currentNode = currentNode.next
        currentNode.next = Newnode
        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        currentNode = self.head
        while(currentNode is not None):
            if currentNode.data == key:
                return True
            currentNode = currentNode.next
        return False
        
        
        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        currentNode = self.head
        if(currentNode is not None):
            if (currentNode.data == key):
                self.head = currentNode.next
                currentNode = None
                return
        while (currentNode is not None):
         if currentNode.data == key:
            break
         prev = currentNode
         currentNode = currentNode.next

        if (currentNode == None):
            return

        prev.next = currentNode.next
        currentNode = None

list = SinglyLinkedList()
list.head = ListNode("A")
b = ListNode("B")
c = ListNode("C")
list.head.next = b
b.next = c
list.append("D")
list.remove("D")
list.show()