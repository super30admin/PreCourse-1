class ListNode:
    """
    A node in a singly-linked list.
    """
    def __init__(self, data=None, next=None):
      self.head = data
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
        insertData = ListNode(self, data)
        self.append(insertData)
        self.size = +1
        return True

        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        curr = self.head
        while curr:
          if curr.data == key:
            return key
          else:
            curr = self.next
        return None

        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        prev = None
        curr = self.head
        while curr:
          if curr.data == key:
            if prev:
              curr = self.next
              self.next = curr
            else:
              self.head = self.next
            return True
          
          prev = curr
          curr = self.next

        return False
