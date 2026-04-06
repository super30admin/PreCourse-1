
# // Time Complexity : O(n)
# // Space Complexity : O(n)
# // Did this code successfully run on Leetcode :
# // Any problem you faced while coding this :
# - forgot the else condition in append method
# - for remove, you need to make sure you can handle the head node or last node being the node to delete, and also account for node not being found


# // Your code here along with comments explaining your approach


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
        if self.head is None:
            self.head = ListNode(data)
        else:
            cur = self.head 
            while cur.next:
                cur = cur.next 

            cur.next = ListNode(data)

        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        cur = self.head 
        while cur:
            if cur.data == key:
                return cur
            cur = cur.next
        return None  

# 1->2->3
# p  c
        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        cur = self.head 
        prev = None 
        # head case
        if cur and cur.data == key:
            self.head = cur.next 
            return

        # otherwise find node to remove
        while cur and cur.data != key:
            prev = cur 
            cur = cur.next

        # node to remove was not found
        if cur is None:
            return 

        # found, remove it
        prev.next = cur.next 

