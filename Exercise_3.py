#Exercise_3 : Implement Singly Linked List.

#Time Complexity : O(n)
#Space Complexity : O(n)
#Did this code successfully run on Leetcode : Didn't find on leetcode
#Any problem you faced while coding this : Not sure if remove satisfies all edge cases

#Your code here along with comments explaining your approach

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
        if self.head:                   #checking if head is empty, if not,
            newNode = self.head         #assign newNode to next of last node
            while newNode != None:
                newNode = newNode.next
            newNode.next = data
        self.head = newNode             #if yes, assign new node to head
        
        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        currNode = self.head            #setting curr node
        while currNode != None:         #iterate till there is data
            if currNode == key:         #if data == key, print data
                return currNode
            currNode = currNode.next
        return None

        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        remNode = self.head                     #setting remNode
        if remNode:                             #if head node is to be removed
            if remNode.data == key:
                self.head = remNode.next
                remNode = None
                return
        while remNode:                          #search for the node to be removed
            if remNode.data == key:
                break
            prevNode = remNode
            remNode = remNode.next
        prevNode.next = remNode.next
        remNode = None
