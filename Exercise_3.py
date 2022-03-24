#Did this code successfully run on Leetcode : Yes
#Any problem you faced while coding this : No
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
        #Create a node for the data to insert
        nextNode = ListNode(data) 
        #checking if linked list is empty or not and making new node ie., nextNode as head
        if self.head is None:
            self.head = nextNode 
        #if not traverse till end
        lastNode = self.head
        while (lastNode.next):
            lastNode = lastNode.next 
        #updating the nextNode of lastNode
        lastNode.next = nextNode
        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        #assign the search node to head and loop until searchNode != None
        searchNode = self.head 
        while (searchNode != None):
            if (searchNode.data == key):
                #if element is found
                return searchNode
            
            searchNode = searchNode.next
        #if element is not found 
        return None 
        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        removeNode = self.head
        #checking if initial node has the key that has to be removed
        if (removeNode != None):
            if (removeNode.data == key):
                self.head = removeNode.next
                removeNode = None
                return
        #checking for the key to be removed and making note of previous node
        while(removeNode != None):
            if removeNode.data == key:
                break
            previousNode = removeNode
            removeNode = removeNode.next
 
        # checking if key is present or not in linked list
        if(removeNode == None):
            return 
        #removing the node from linked list
        previousNode.next = removeNode.next 
        removeNode = None

