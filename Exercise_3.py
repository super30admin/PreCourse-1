"""
// Time Complexity :  As mentioned in each function
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : problem not there on Leetcode
// Any problem you faced while coding this : No
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
        #print(node.data)
        if self.head==None: #if the linkedlist is empty, make the new node the head 
            self.head=node
        else:
            ptr = self.head #else iterate over the entire list to get to the end, where the next variable for the node is None
            while ptr.next:
                ptr=ptr.next
            ptr.next=node #attach the node at the last node
            #print(ptr.next)   
        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        if self.head==None: # if the linked list is empty, return None
            return None
        ptr = self.head
        #print(ptr.next.data)
        while ptr.next != None: #else iterate over the lit until element is found and return the element
            #print("here")
            if ptr.data==key:
                #print("found")
                return ptr
            ptr=ptr.next 
        
        return None
        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        
        if self.head.data==key: #if the first element is the key, remove it by making the head point to the element next in sequence
            self.head=self.head.next
            
        else:
            ptr=self.head #else iterate over the list, keeping track of the next element
            while ptr.next.next:
                if  ptr.next.data==key:#if the next element is the key, remove it by breaking the link
                    ptr.next=ptr.next.next
                    break
                ptr=ptr.next  
                    
