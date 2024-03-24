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
        l1 = self.head
        while(l1.next != None):
            l1 = l1.next
        l1.next = ListNode(data)
        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        l1 = self.head
        while(l1.next) != None:
            if l1.data == key:
                return l1
            else:
                l1 = l1.next
        return None

        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        if self.head.next == None:
            return ('No Key found')

        l1 = self.head
        r1 = self.head.next
        while (r1):
            if r1.data == key:
                l1.next = r1.next
                r1.next = None
                return self.head.next
            else:
                r1 = r1.next
                l1 = l1.next
        return ('No key found')
