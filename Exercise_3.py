""" 
Time Complexity : O(n) for find,remove and append
Space Complexity :O(n) for maintaining a list
Did this code successfully run on Leetcode :Yes
Any problem you faced while coding this :No
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
        new_node = ListNode(data)
        if self.head is None:
            self.head = new_node
            return
        #else traverse the linkedlist till last node
        last_node = self.head.next
        while last_node:
            last_node = last_node.next
        #modify next of the last node
        last_node.next = new_node



        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        current_element = self.head
        while current_element != None:
            if current_element.data == key:
                return key
            else:
                current_element = current_element.next
        
        return None
        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        current_element = self.head
        while current_element is not None:
            #if data is in first node
            if current_element.data  == key:
                self.head = current_element.next
                return
            #if data is in other nodes
            prev_element = current_element
            current_element = current_element.next
            if current_element.data == key:
                prev_element.next = current_element.next
                return

