# Time Complexity : O(n) 
# Space Complexity : O(n)
# Did this code successfully run on Leetcode :


class ListNode:
    """
    A node in a singly-linked list.
    """
    def __init__(self, data=None, next=None):
        self.data = data
        self.next= next
    
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
        newnode = ListNode(data)
        newnode.next = self.head
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        current = self.head
        found = False
        while current and found is False:
            if current.data == key:
                found = True
            else:
                current = current.next
        #if current is none will return none
        return current                
        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        current  = self.head
        prev = None
        found = False
        while current and found is False:
            if current.data ==key:
                found = True
            else:
                prev = current
                current = current.next
        # if current is None:
        # will return None
        if prev is None:
            self.head = current.next
        else:
            prev.next = current.next    

