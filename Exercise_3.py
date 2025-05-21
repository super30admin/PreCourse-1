# Time Complexity : O(n)
# Space Complexity :  O(1)
# Did this code successfully run on Leetcode : I did not run it on Leetcode
# Any problem you faced while coding this : No


# Your code here along with comments explaining your approach

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
        # If the list is empty, create a new node and set it as the head
        if self.head is None:
            self.head=ListNode(data)
            return
        new_node=ListNode(data)
        # Traverse the list to find the last node and append the new node
        last=self.head
        while last.next:
            last=last.next
        last.next=new_node
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        # If the list is empty, return None
        if self.head is None:
            return None
        # Traverse the list to find the element
        current = self.head
        while current:
            if current.data == key:
                return current
            current = current.next
        return None
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        # If the list is empty, do nothing
        if self.head is None:
            return
        # If the head node is the one to be removed then update the head
        if self.head.data == key:
            self.head = self.head.next
            return
        # Traverse the list to find the element to be removed
        current = self.head
        while current:
            if current.data == key:
                break
            prev = current
            current = current.next
        if curent:
            prev.next = current.next