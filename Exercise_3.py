# Time Complexity : O(n) for all operations where n is the number of nodes. 
# Space Complexity : O(n) where n is the length of the stack. O(1) for all methods. 
# Did this code successfully run on Leetcode : NA
# Any problem you faced while coding this : NA

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
        newNode = ListNode(data)
        if self.head == None:
            self.head = newNode
            return
        curr = self.head
        while( curr.next != None):
            curr = curr.next
        curr.next = newNode
        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        curr = self.head
        while(curr!= None and curr.data != key):
            curr = curr.next
        if curr == None:
            return None
        return curr.data
        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        if self.head.data == key:
            self.head = self.head.next
            return
        prev = None
        curr = self.head
        while(curr != None and curr.data != key):
            prev = key
            curr = curr.next
        if curr != None:
            prev.next = curr.next

