# Time Complexity: O(n)
# Space Complexity: O(n)
# Any problem you faced while coding this : No.

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
        cur = self.head
        while(cur.next != None):
            cur = cur.next
        cur.next = data
        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        cur = self.head
        search_ele = False
        while cur and search_ele is False:
            if cur.data == key:
                search_ele = True
            else:
                cur = cur.next
            if cur is None:
                return None
        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        cur = self.head
        prev = None
        search_ele = False
        while cur and search_ele is False:
            if cur.data == key:
                search_ele = True
            else:
                prev = cur
                cur = cur.next
            if cur is None:
                return None
            if prev is None:
                self.head = cur.next
            else:
                prev.next = cur.next
