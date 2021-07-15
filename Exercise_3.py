"""
Time Complexity : O(n)
Space Complexity : O(n)
Did this code successfully run on Leetcode : Yes
Any problem you faced while coding this :
"""
class ListNode:
    """
    A node in a singly-linked list.
    """
    def __init__(self, data=None, next=None):
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
        """To add the element at the end of the list 
            we need to traverse through the list and 
            insert at the very end of the list
        """
        if self.head == None:
            self.head = ListNode(data,None)
        else:
            newNode = ListNode(data,None)
            endNode = self.head
            while(endNode.next != None):
                endNode = endNode.next
            endNode.next = newNode
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        """To find the element from the list 
            we need to traverse through the list unless 
            the element is found just in the head
        """
        currentNode = self.head
        while(currentNode.next != None):
            if currentNode.data == key:
                return True
            else:
                currentNode = currentNode.next
        return None
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        """To remove the element from the list 
            we need to traverse through the list unless 
            the element is found just in the head and 
            also keep track of the previous pointer.
            Once found we need to assign the pointer first 
            to the next of next and then break the link
        """
        currentNode = self.head
        if self.head.data == key:
            currentNode = self.head
            self.head = currentNode.next
            currentNode = None
        else:
            while(currentNode.next != None):
                if currentNode.data == key:
                    break
                prev = currentNode
                currentNode = currentNode.next
            prev.next = currentNode.next
            currentNode = None