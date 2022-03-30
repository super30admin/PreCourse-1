class ListNode:
    """
    A node in a singly-linked list.
    """
    def _init_(self, data=None, next=None):
        self.data = data
        self.next = next
    
    def get_data(self):
        return self.data
        
    def get_next(self):
        return self.next
    
    def set_next(self, node):
        self.next = node

class SinglyLinkedList:
    def _init_(self):
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
        node = ListNode(data, self.head)
        self.head = node
        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        curr = self.head
        while curr:
            if curr.get_data() == key:
                return key
            else:
                curr = curr.get_next()
        return None
        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        prev = None
        curr = self.head
        while curr:
          if curr.get_data() == key:
            if prev:
                prev.set_next(curr.get_next())
            else:
                self.head = curr.get_next()
            return True
          prev = curr
          curr = curr.get_next()
        return False