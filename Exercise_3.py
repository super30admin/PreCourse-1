# Time Complexity : O(n)
class ListNode:
    """
    A node in a singly-linked list.
    """
    def __init__(self, data=None, next=None):
        self.head = None
    
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
        if self.head = None:
            self.head = ListNode(data)
        else:
            addd = ListNode(data)
            temp = self.head
            while temp.next != None:
                temp = temp.next
            temp.next = addd
        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        iteration = self.head
        while iteration.next is not None:
            if iteration.data == key:
                return iteration
            else:
                iteration = iteration.next
        return None
        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        if self.head.data == key:
            self.head = self.head.next
        else:
            iteration = self.head
            while iteration.next is not None:
                if iteration.next.data == key:
                    iteration.next = iter.next.next
                else:
                    iteration = iteration.next
