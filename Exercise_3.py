from http.client import NETWORK_AUTHENTICATION_REQUIRED

from Exercise_2 import Node


class ListNode:
    """
    A node in a singly-linked list.
    """
    def __init__(self, data=None, next=None):
        self.data = data #Data will hold the value of the element
        self.next = next #Next will have the link to the next node
    
class SinglyLinkedList:
    def __init__(self):
        """
        Create a new singly-linked list.
        Takes O(1) time.
        """
        self.head = None #Initialize head

    def append(self, data):
        """
        Insert a new element at the end of the list.
        Takes O(n) time.
        """

        node = ListNode(data) #Instantiate the ListNode object
        if(self.head == None): 
            self.head = node #Instantiated node will be the head if the linked list is empty
        else:
            current = self.head #Declare and define current variable to loop through the end of the linked list
            while(current.next):
                current = current.next #Loop through the list one by one until the end is reached
            current.next = node #Link the new node to the end of the linked list
        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
    
        if(self.head == None): #Return None if linked list is empty
            return None
        else:
            current = self.head 
            while(current.next): #Declare and define current variable to loop through the end of the linked list
                if(current.data == key): #If current node contains the key, return
                    return current.data
                current = current.next #Loop through the list one by one until the end is reached
            return None #Return None if key is not found
        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """

        temp = self.head #Declare and define a temp variable to loop through the list
        if(self.head is not None): #Check if linked list is empty
            if(temp.data == key): #If head contains the key, remove its link from the SLL
                self.head = temp.next
                temp = None
                return
        
        while(temp is not None): #If there are more elements in the SLL, loop through those elements one by one to find they key
            if(temp.data == key):
                break
            previous = temp #Use 'previous' variable to store the value of the previous node to help with linkage during removal
            temp = temp.next #Loop through the entire SLL one by one

        if(temp == None): #Return if key is not found
            return

        previous.next = temp.next #If key is found, link the previous node the node after the key node
        temp = None #Delete temp (key)