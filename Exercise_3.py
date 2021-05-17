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
        node = ListNode(data)
        if self.head == None:
            self.head = node
            return;
        pos = self.head
        while pos.next != None:
            pos = pos.next
        pos.next = node
        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        pres = self.head
        # parsing through the linked list if the end of the linked list is 
        # reached then element is not present
        # if there exists node with same key returning the node
        while pres != None and pres.data != key:
            pres = pres.next
        if pres == None:
            return None;
        else:
            return pres



    def printLL(self):
        pres = self.head
        while pres != None:
            print(pres.data)
            pres = pres.next   
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        pres = self.head
        prev = None
        # parsing through the linked list if the end of the linked list is 
        # reached then element is not present
        # if there exists node with same key then assign next of previous 
        # as next next of prev
        if self.head.data == key:
            self.head = self.head.next
            return;
        while pres != None and pres.data != key:
            prev =  pres
            pres = pres.next
        if pres == None:
            return;
        else:
            prev.next = prev.next.next
            return;

l = SinglyLinkedList()
l.append(1)
l.append(2)
l.append(3)
l.printLL()
l.remove(2)
l.printLL()