class ListNode:
    """
    A node in a singly-linked list.
    """
    def __init__(self, data=None, next=None):
        self.data=data
        self.next=None
    
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
        temp = self.head
        if temp==None:
            self.head=temp
        else:
            while temp.next != None:
                temp=temp.next
            temp.next=newNode

    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        temp = self.head
        if temp == None:
            return None
        while temp!=None:
            if temp.data == key:
                return temp
            temp = temp.next
        return None
        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        if self.head.data==key:
            self.head = self.head.next
            return
        prev=None
        while temp.data != key:
            prev = temp
            temp = temp.next
        nextNode = temp.next
        prev.next = nextNode
