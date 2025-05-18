# Exercise_1 :  Implement Singly Linked List.

# Time Complexity : O(n)
# Space Complexity : O(n) - considering adding n elements  
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : always return the updated list
# Your code here along with comments explaining your approach -  

class ListNode:
    """
    A node in a singly-linked list.
    """
    # initalising a node with next and data 
    def __init__(self, data=None, next=None):
        self.data = data 
        self.next = next ## check carefully about the initialization 
    
class SinglyLinkedList:
    # setting head = none of the linkedlist 
    def __init__(self):
        """
        Create a new singly-linked list.
        Takes O(1) time.
        """
        self.head = None

    # adding a new element at the end of the list, checking specifically for head, otherwise at the end of the list 
    def append(self, data):
        """
        Insert a new element at the end of the list.
        Takes O(n) time.
        """
        if self.head is None:
            self.head = ListNode(data)
            return ## always return, otherwise it will lead to multiple additions 

        curr = self.head 
        while curr:
            if curr.next == None:
                new_node = ListNode(data)
                curr.next = new_node
                new_node.next = None 
                return ## always return, otherwise it will lead to multiple additions 
            else:
                curr = curr.next 
        
    # looking for the key and then returning the node 
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        curr = self.head 
        while curr:
            if curr.data == key:
                return curr
            else:
                curr = curr.next
        return None   
        
    # removing the first occurence, checks if the head contains the key, then look for the other nodes. 
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        if self.head.data == key:
            self.head = self.head.next
        curr = self.head.next 
        prev = self.head 
        while curr:
            if curr.data != key:
                prev = curr
                curr = curr.next 
            else:
                prev.next = curr.next
                curr.next = None 
                return 
