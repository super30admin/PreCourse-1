  #Time Complexity : O(n)
  # #Space Complexity : O(n)
  # Did this code successfully run on Leetcode : Yes
  # Any problem you faced while coding this : No

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
        new_node = ListNode (data)
        if self.head:
            current = self.head
            while current.next:
                current= current.next
            current.next= new_node
        else:
            self.head = new_node

    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        current = self.head
        while current:
            if current.data == key:
                return current.data
            current = current.next
        return None
    
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        current = self.head
        previous = None
        found = False
        while current and not found:
            if current.data == key:
                found = True
            else:
                previous = current
                current = current.next
        if current is None:
            raise ValueError("Data not in list")
        if previous is None:
            self.head = current.next
        else:
            previous.next = current.next
        return current.data 
    
    def print_list(self):
        if self.head is None:
            return None
        new_node = self.head
        while new_node:
            print(new_node.data)
            new_node = new_node.next