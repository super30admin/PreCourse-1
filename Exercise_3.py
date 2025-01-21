'''
"""
Time Complexity: O(n)
Space Complexity: O(n)
Did this code successfully run on Leetcode: Yes
Any problem you faced while coding this: No

Your code here along with comments explaining your approach:

append():
  1. Create a new node with the given data
  2. If the list is empty, set the head to the new node
  3. Traverse to the end of the list and add the new node
  
 find():
  1. Start from the head and iterate through the list
  2. Compare each node's data with the key
  3. Return the node if found, else return None
  
remove():
  1. Start from the head and iterate through the list
  2. Keep track of the previous node while searching for the key
  3. Remove the node by adjusting the previous node's next pointer

'''
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
        new_node = ListNode(data)
        if not self.head:
            self.head = new_node
            return
        current = self.head
        while current.next:
            current = current.next
        current.next = new_node
        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        current = self.head
        while current:
            if current.data == key:
                return current
            current = current.next
        return None
        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        current = self.head
        previous = None
        
        while current:
            if current.data == key:
                if previous:
                    previous.next = current.next
                else:
                    self.head = current.next
                return
            previous = current
            current = current.next

