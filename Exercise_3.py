class ListNode:
    """
    A node in a singly-linked list.
    """
    def __init__(self, data = None, next = None):
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
        new_node = ListNode(data)
        # check if the list is Empty or not
        if self.head is None:
          # add the new node as the head node of the list
          self.head = new_node
          return
        # traverse to the end of the list
        last = self.head
        while last.next:
          # replace last with last.next node
          last = last.next
        # point the last node next pointer to new node
        last.next = new_node
        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        node_n = self.head
        
        while node_n and node_n.data is not key:
          node_n = node_n.next
        
        if node_n is None:
          return None
        
        return node_n.data
        
        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        curr = self.head

        if curr and curr.data == key:
          self.head = curr.next
          curr = None
          return
        
        prev = None
        while curr and curr.data is not key:
          prev = curr
          curr = curr.next
        
        if curr is None:
          return None
        
        prev.next = curr.next
        curr = None