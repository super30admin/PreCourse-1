# Time Complexity: O(n) for find, remove and print and O(1) for append
# Space Complexity: O(n)

from typing import Optional
class ListNode:
    """
    A node in a singly-linked list.
    """
    def __init__(self, data=None, next:'ListNode' = None):
        self.data = data
        self.next = next
    
class SinglyLinkedList:
    def __init__(self):
        """
        Create a new singly-linked list.
        Takes O(1) time.
        """
        self.head = ListNode(-1)
        self.pointer = self.head

    def append(self, data):
        """
        Insert a new element at the end of the list.
        Takes O(n) time.
        """
        self.pointer.next = ListNode(data)
        self.pointer = self.pointer.next
        
        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        search_pointer = self.head.next
        while search_pointer:
            if search_pointer.data == key:
                return search_pointer
            search_pointer = search_pointer.next
        return None
        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        prev = self.head
        search_pointer = self.head.next
        while search_pointer:
            if search_pointer.data == key:
                prev.next = search_pointer.next
                break
            prev = search_pointer
            search_pointer = search_pointer.next
        return None

    #Added this function to help test inputs
    def print(self):
        """
        Print all elements
        Takes O(n) time.
        """
        print_pointer = self.head.next
        while print_pointer:
            print(print_pointer.data)
            print_pointer = print_pointer.next
        print("*************")