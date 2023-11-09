# Submitted by : Aryan Singh_RN12MAY2023 
# Time Complexity : O(n)
# Space Complexity : O(n)
# Did this code successfully run on Leetcode : Not applicable
# Any problem you faced while coding this : No

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
        new_node = ListNode(data)
        if self.head == None:
            self.head = new_node
        else:
            pointer = self.head
            while(pointer.next != None):
                pointer = pointer.next
            pointer.next = new_node
        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        pointer = self.head
        while(pointer != None):
            if pointer.data == key:
                return key
            pointer = pointer.next
        return None
        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        if self.head:
            pointer = self.head
            if pointer.data == key:
                self.head = pointer.next
                return
            pointer = pointer.next
            previous = self.head
            while pointer != None:
                if pointer.data == key:
                    previous.next = pointer.next
                    return
                previous = pointer
                pointer = pointer.next
        return
