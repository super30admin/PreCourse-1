# O(n) time for all
#o(1) space

class ListNode:
    """
    A node in a singly-linked list.
    """
    def __init__(self, data=None, next=None):
        self.data= data
        self.next=next
    
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

        cur= self.head
        if cur == None:
            self.head= ListNode(data)
        else:
            while cur:
                if cur.next==None:
                    cur.next= ListNode(data)
                    return
                cur= cur.next

        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        cur= self.head
        while cur:
            if cur.data==key:
                return True
            cur= cur.next
        return False

        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        cur = self.head
        prev = None
        while cur:

            if cur.data == key:
                if prev is None:
                    self.head = cur.next  # Update head to the next node
                else:
                    prev.next = cur.next
                    return True
            prev = cur  # Move previous to current
            cur = cur.next  # Move current to next node

        return False


