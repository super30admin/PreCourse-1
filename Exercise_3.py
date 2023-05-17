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
            nodeAdd = ListNode(data=data)
            self.head = nodeAdd
        else:
            nodeToAdd = ListNode(data=data)
            curr = self.head
            while curr.next != None:
                curr = curr.next
            curr.next = nodeToAdd
            


        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        returnValue = 'None'
        curr = self.head
        goOn = True
        while curr != None and goOn:
            if curr.data == key:
                returnValue = curr.data
                goOn = False
            else:
                curr = curr.next
        return returnValue
            
        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        curr = self.head
        prev = self.head
        goOn = True
        while curr != None and goOn:
            if curr.data == key:
                prev.next = curr.next
                if curr == self.head:
                    self.head = curr.next
                goOn = False
            else:
                prev = curr
                curr = curr.next
    
    def show(self):
        curr = self.head
        while curr != None:
            print(curr.data)
            curr = curr.next





