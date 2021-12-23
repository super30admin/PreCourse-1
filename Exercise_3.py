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
            self.head = ListNode(data)
        else:
            temp = self.head
            while temp.next:
                temp = temp.next
            temp.next = ListNode(data)
        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        temp = self.head
        while temp.next:
            if temp.data == key:
                return ('found',temp)
            temp = temp.next
        return None
        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        if self.head == None:
            return
        else:
            temp1 = self.head
            if temp1.data == key:
                self.head = temp1.next
                temp1 = None
                return
            temp2 = temp1.next
            while temp2.next:
                if temp2.data == key:
                    temp1.next = temp2.next
                    temp2 = None
                    return
