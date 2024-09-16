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
        if self.head == None:
            self.head = data
        else:
            temp = self.head
            while(temp.next != None):
                temp = temp.next
            temp.next = self.data
        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        while(self.next):
            flag = False
            if self.data == key:
                flag = True
                return self.data
            self = self.next
        
        if flag == False:
            return None
        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        while(self.next.data != key):
            self =  self.next
        temp = self.data
        temp.next = self.next.data
       
    def printList(self):
        if self.head == None:
            return
        else:
            temp = self.head
            while(temp.next != None):
                print(temp.data)
                temp = temp.next
