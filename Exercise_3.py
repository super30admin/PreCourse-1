# Time Complexity: append, find, remove- O(n)
# Space Complexity : O(n)
# Did this code successfully run on Leetcode : -
# Any problem you faced while coding this : No


# Your code here along with comments explaining your approach
"""implemented a singly linked list"""

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
        self.current = None
        self.previous = None

    def append(self, data):
        """
        Insert a new element at the end of the list.
        Takes O(n) time.
        """
        if self.head == None:
            self.head = ListNode(data)
            return
        
        self.current = self.head
        while self.current.next != None:
            self.current = self.current.next
        
        self.current.next = ListNode(data)
        return

        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        self.current = self.head

        while self.current.data != key and self.current.next != None:
            self.current = self.current.next
        
        if self.current.data == key:
            return self.current.data
        else:
            return None

                
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """

        self.current = self.head

        if self.current.data == key:
            self.head = self.current.next
            return
        
        while self.current.data != key:
            self.previous = self.current
            self.current = self.previous.next
        self.previous.next = self.current.next
        return
    

LL = SinglyLinkedList()

LL.append(1)
LL.append(2)
LL.find(1)
LL.find(2)
LL.remove(1)
LL.find(1)
LL.find(2)