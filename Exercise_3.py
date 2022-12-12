# Exercise_3 : Implement Singly Linked List
# Successful Run on Leetcode: N/A
# Challenges: None

class ListNode:
    """
    A node in a singly-linked list.
    """
    def __init__(self, data=None, next=None):
        self.data = data # value of the node
        self.next = next # pointer to the next node
    
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
        # if the head is None, set the data node as the head
        if not self.head:
            self.head = ListNode(data)
            return
        # else iterate through the end of the linked list and add the new data node 
        while self.head.next:
            self.head = self.head.next
        self.head.next = ListNode(data)
            
        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        # initialize curr as the head of the linked list
        curr = self.head
        # while curr node is present, check if the data matches the key
        while curr:
            # if the data matches the key, return the node
            if curr.data == key:
                return curr
            # continue iterating through the end of the linked list 
            curr = curr.next
        # if there is no node with the data matching the key, return None
        return None
        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        # intialize prev node and set it to None
        prev = None
        # intialize curr node and set it to the head of the linked list
        curr = self.head
        # while the curr node is present, check if the data matches the key
        while curr:
            # if the data matches the key, check if the prev node is not None.
            if curr.data == key:
                # if the prev node is None, the node to be removed is the head of the linked list. set the head of the linked list to be curr.next
                if not prev:
                    self.head = curr.next
                # otherwise, set the next pointer of the prev node to point to the next pointer of the curr node
                else:
                    prev.next = curr.next
                return
            # iterate through the end of the linked list to find the first occurrence of the 'key' in the list
            prev = curr
            curr = curr.next
            