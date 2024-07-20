# Time Complexity : O(n) for all operations as we are traversing the entire list.
# Space Complexity : O(n)
# Did this code successfully run on Leetcode : No didnt find the relevant leetcode problem
# Any problem you faced while coding this :
"""knew the logic but speed was slow."""

# Your code here along with comments explaining your approach
"""For append:
Traversed to the end of the linked list using a cur pointer
and attached the newly created node to it. In case of empty list assigned head to the new node.
"""
"""For find:
Traversed through each of the nodes of the linked list using a cur pointer
and checking if node.data == key, if true returning the key else returning null.
"""
"""For remove:
Traversed through each of the nodes of the linked list using a cur pointer and prev pointer
and checking if node.data == key, if true dropping the cur node by connecting prev.next to cur.next and returning the key 
else assigning prev to cur and cur to cur.next for further traversal.
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
        node = ListNode(data)
        if not self.head:
            self.head = node
        else:
            cur = self.head
            while cur.next:
                cur = cur.next
            cur.next = node
        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        if self.head:
            cur = self.head
            while cur:
                if cur.data == key:
                    return key
                cur = cur.next
        return None
        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        if self.head:
            cur = prev = self.head
            while cur:
                if cur.data == key:
                    prev.next = cur.next
                    return
                prev = cur
                cur = cur.next
        return None