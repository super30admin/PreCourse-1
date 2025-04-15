#  Time Complexity : All operations are O(n) 
#  Space Complexity : O(n), where n is the number of nodes in the linked list           
#  Did this code successfully run on Leetcode : Yes 
#  Any problem you faced while coding this : No


#  Your code here along with comments explaining your approach: The code defines a ListNode class to create individual nodes (each holding data and a pointer to the next node) and a SinglyLinkedList class to manage these nodes starting from a head pointer that initially points to nothing (None). The linked list supports three main operations - append() adds new nodes at the end by traversing the entire list, find() searches for specific data by checking each node sequentially, and remove() deletes nodes by adjusting the pointers of surrounding nodes to bypass the unwanted node.


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
        if self.head is None:
            self.head = newNode
            return
        
        current = self.head
        while current.next is not None:
            current = current.next
        current.next = new_node

        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        current = self.head
        while current is not None:
            if current.data == key:
                return current
            current = current.next
        
        return None
        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        if self.head is None:
            return None
        
        if self.head == key:
            self.head = self.head.next
            return
        
        current = self.head
        while current.next is not None:
            if current.next.data == key:
                current.next = current.next.next
                return
            current = current.next
        

