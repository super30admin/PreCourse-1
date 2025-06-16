# // Time Complexity : O(n) { expcet __init__() : O(1) }
# // Space Complexity : O(n)
# // Did this code successfully run on Leetcode :
# // Any problem you faced while coding this :

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
        if(self.head == None):
            self.head = ListNode(data)
        else:
            node = self.head
            while(node.next is not None):
                node = node.next
            node.next = ListNode(data)
        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        
        node = self.head
        while(node is not None):
            if(node.data == key):
                return node.data
            node = node.next
        return None
        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        if(self.head.data == key):
            self.head = self.head.next
        else:
            node = self.head.next
            parent = self.head
            while(node is not None):
                if(node.data == key):
                    parent.next = node.next
                parent = node
                node = node.next
           