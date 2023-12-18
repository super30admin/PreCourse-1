# Time Complexity : all operations  have a time complexity of O(N) other then creating the linked list which is O(1)
# Space Complexity : O(N)
# Did this code successfully run on Leetcode : Ran Locally 
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
        # setting the head of the list to none

    def append(self, data):
        """
        Insert a new element at the end of the list.
        Takes O(n) time.
        """

        if not self.head:
            self.head = ListNode(data) # if our list is empty we will generate a new node from our data and make that the head, otherwise we go over the list all the way to the end and add the node
        else:
            index = self.head
            while index.next:
                index = index.next
            index.next = ListNode(data)
        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        index = self.head
        while index:
            if index.data == key: # if the current node is the same val as our key return the node
                return index
        return None
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        index = self.head
        pre_index = None
        while index:
            if index.data == key:
                removed = index.data
                if pre_index:
                    pre_index.next = index.next # if the node we want to remove is not the head we will skip over it, otherwise we would update the head if it was
                else:
                    self.head = index.next
                return removed # returning the val of the node removed to indicate what was removed 
            pre_index = index
            index = index.next
        return None
