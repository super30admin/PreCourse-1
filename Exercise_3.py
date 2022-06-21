
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
        temp = self.head
        if self.head == None:
            self.head = ListNode(data)
        else:
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
        while temp:
            if temp.data == key:
                return key
            temp = temp.next
        return None
        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        temp = self.head
        while temp:
            if temp.data == key:
                if temp == self.head:
                    temp1 = head
                    head = head.next
                    temp1.next = None
                elif temp.next == None:
                    prev.next = None
                else:
                    prev.next = temp.next
                    temp.next = none
            prev = temp
            temp = temp.next