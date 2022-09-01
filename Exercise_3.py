'''
Time Complexity: O(n)
Space Complexity: O(n)
'''

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
        node = ListNode(data)
        if self.head == None:
            self.head = node
        else:
            p = self.head
            while p.next:
                p = p.next 
            p.next = node       
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        if self.head != None:
            p = self.head
            while p.next:
                if p.data == key:
                    return key
                p = p.next
        return None        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        if self.head != None:
            p = self.head
            while p.next:
                if p.data == key:
                    p.data = p.next.data
                    p.next = p.next.next
                    return key
                p = p.next
            return "not found"    
        else:
            return "list is empty"