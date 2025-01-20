#Implement Singly Linked List.
# Time Complexity : O(n) for all operations
# Space Complexity : O(n) 
# Did this code successfully run on Leetcode :
# Any problem you faced while coding this :

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

        #Traverse to end of list
        curr = self.head
        while curr.next is not None:
            curr = curr.next
        curr.next = ListNode(data,None)
        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        if self.head.data == key:
            return self.head
        curr = self.head
        while curr.next is not None:
            if curr.data == key:
                return curr
            curr = curr.next
        return None

    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """

        curr = self.head
        prev = None
        while curr is not None:
            if curr.data == key:
                if prev == None:
                    self.head = curr.next
                else:
                    prev.next = curr.next
            prev = curr
            curr = curr.next
