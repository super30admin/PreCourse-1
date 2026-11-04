# Time Complexity : append O(n), find O(n), remove O(n)
# Space Complexity : O(n) for the list itself; each operation uses O(1) extra space
# Did this code successfully run on Leetcode : No exact match on LeetCode
# Any problem you faced while coding this : No

# Approach: The list keeps a reference to the head node. append walks to
# the last node and links the new node after it. find walks from the head
# comparing each node's data to the key. remove walks with two pointers
# (prev and curr) so that when the key is found, prev.next can skip over
# curr; if the key is in the head, head simply moves to the next node.


# Exercise_3 : Implement Singly Linked List.
class ListNode:
    """
    A node in a singly-linked list.
    """
    def __init__(self, data=None, next=None):
        self.data=data
        self.next=None    
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
        if self.head is None:          
            self.head = new_node
            return
        curr = self.head
        while curr.next is not None:   
            curr = curr.next
        curr.next = new_node
        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        curr = self.head
        while curr is not None:
            if curr.data == key:
                return curr            
            curr = curr.next
        return None
        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        prev = None
        curr = self.head
        while curr is not None:
            if curr.data == key:
                if prev is None:       
                    self.head = curr.next
                else:                  
                    prev.next = curr.next
                return
            prev = curr
            curr = curr.next
