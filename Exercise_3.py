# Time Complexity : O(n) for all operations
# Space Complexity : O(n) where n is the size of linked list itself.
# Did this code successfully run on Leetcode : -
# Any problem you faced while coding this : append() could have been O(1) however the comment left there said "O(n)" so I coded that instead

# Used a sentinel node at the beginning to avoid base-case null checks and keep code uniform.


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
        # Adding a sentinel node as head
        self.head = ListNode()

    def append(self, data):
        """
        Insert a new element at the end of the list.
        Takes O(n) time.
        """
        curr = self.head
        while curr.next != None:
            curr = curr.next
        curr.next = ListNode(data)

        
        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        curr = self.head.next
        while curr != None:
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
        while curr.next != None:
            if curr.next.data == key:
                curr.next = curr.next.next
                break
            curr = curr.next
    
