# Time Complexity : O(1)
# Space Complexity : O(n)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this :
'''
None
'''
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
        # Create a ListNode for new data
        newNode = ListNode(data)

        # if the linked list is empty then add new node as head
        if self.head == None:
            self.head = newNode

        # if the linked list is not empty then traverse the linked list till the node. next is None ie. last node
        current = self.head
        while current.next != None:
            current = current.next
        # Add newNode after last node by storing the newNode in the current.next
        current.next = newNode
        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        current = self.head
        # Traverse the linked list
        while current:
            # Everytime check the data of the node with the key. If it is equal then return the node
            if current.data == key:
                return current
            current = current.next
        # If the key is not present then return None
        return None
        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        # If the linked list is empty
        if self.head is None:
            return 
        
        # if the key is present at head ie. the first element of the linked list
        if self.head.data == key:
            self.head = self.head.next
            return 
        
        # Traverse the linked list
        current = self.head
        while current.next:
            # We check if the data of the next element is equal to key 
            if current.next.data == key:
                # it is equal then store the pointer of next of next of element in the current. next
                current.next = current.next.next
                return 
            current = current.next
