# Exercise_3 : Implement Singly Linked List.
# // Time Complexity : Append, Find, Remove : O(n)
# // Space Complexity : O(1)
from email import header


class ListNode:
    """
    A node in a singly-linked list.
    """
    def __init__(self, data):
        self.data = data
        self.next = None
    
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
        # temp = self.head 
        new = ListNode(data)
        if self.head==None:
            self.head = new 
            return 
        temp = self.head
        while temp.next is not None:
            temp = temp.next
        temp.next = new # last element is given the new node

    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        curr = self.head
        while curr is not None:
            if curr.data==key:
                print("true")
                return True # found, so return true
            curr = curr.next
        print("false")
        return False # came to end, but could not find a element, hence we return False
        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        curr = self.head
        if curr is not None:
            if curr.data==key:
                self.head = curr.next 
                curr = None
                return 
        while curr is not None:
            if curr.data==key:
                break
        prev = curr
        curr = curr.next
        if curr==None:
            return # it means that we have come to the last and not found any
        prev.next = curr.next # skipping the current element == deleting it
        curr = None
l = SinglyLinkedList()
l.append(1)
l.append(2)
l.append(3)
l.find(1)
l.remove(1)
l.find(1)
