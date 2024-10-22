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
        self.tail = None

    def append(self, data):
        """
        Insert a new element at the end of the list.
        Takes O(n) time.
        """
        if self.head == None:
            self.head = ListNode(data)
            self.tail = self.head
        else:
            self.tail.next = ListNode(data)
            self.tail = self.tail.next
        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        cur = self.head
        while cur:
            if cur.data == key:
                return cur
            cur = cur.next
    
        return None
        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        if self.head == None:
            return 

        if self.head.data == key:
            temp = self.head
            self.head = self.head.next
            
            if self.head == None:
                self.tail = None

            del temp
            return

        prev, cur = self.head, self.head.next
        while cur:
            if cur.data == key:
                prev.next = cur.next

                if cur == self.tail:
                    self.tail = prev
                    
                del cur
                return
            prev = cur
            cur = cur.next
                
        