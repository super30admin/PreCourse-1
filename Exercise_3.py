"""
Created on Sun Feb  8 16:20:59 2026

@author: rishigoswamy

# Time Complexity:
# append : O(n)  (traverses to the end of the list)
# find   : O(n)  (linear search)
# remove : O(n)  (linear traversal to find the key)
#
# Space Complexity:
# O(n), where n is the number of nodes in the linked list.

"""

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
        
        if not self.head:
            self.head = ListNode(data=data)
            return
        
        ptr = self.head
        while ptr.next:
            ptr = ptr.next
        
        ptr.next = ListNode(data=data)
            
        
        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        
        ptr = self.head
        while ptr:
            if ptr.data == key:
                return ptr
            ptr = ptr.next
        
        return None
        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        
        dummy = ListNode(None, None)
        dummy.next = self.head
        
        prev = dummy
        curr = prev.next
        while curr:
            if curr.data == key:
                prev.next = curr.next
                self.head = dummy.next
                return 
            prev = curr
            curr = curr.next
        
        return
        
            
