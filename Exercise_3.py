class ListNode:
    """
    A node in a singly-linked list.
    """
    def __init__(self, data=None, next=None):
      self.data = None
      self.next = None

class SinglyLinkedList:
    def __init__(self):
        """
        Create a new singly-linked list.
        Takes O(1) time.
        """
        self.head = None
        self.tail = None
        self.length = 0

    def append(self, data):
        """
        Insert a new element at the end of the list.
        Takes O(n) time.
        """
        new_node = ListNode(data)
        if self.head == None:
          self.head = new_node
          self.tail = self.head
          self.length = 1
        else:
          self.tail.next = new_node
          self.tail = self.tail.next
          self.length += 1  

    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        curr_node = self.head
        while curr_node != None:
          if curr_node == key:
            return curr_node.data
          curr_node = curr_node.next
        return None    
        

        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        curr_node = self.head
        if curr_node == key:
          self.head = curr_node.next
          self.length -= 1 
          return ('node removed')

        while curr_node.next != None:
          if curr_node.next == key:
            curr_node.next = curr_node.next.next
            self.length -= 1
            return ('node removed')
          curr_node = curr_node.next
        return('key not found') 
