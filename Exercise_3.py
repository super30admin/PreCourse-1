# time complexity O(n)
# Space complexity O(n),where n is the number of nodes 

class ListNode:
    """
    A node in a singly-linked list.
    """
    def __init__(self, data=None, next=None):
        self.data=data
        self.next=next
    
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
        #create a node
        newNode=ListNode(data)

        if self.head is None:
            self.head=newNode
        else:
            #initialize current node to head
            currentNode=self.head
            #traverse till we have some value next to current node
            while currentNode.next:
                currentNode=currentNode.next
            #set the next element to new node
            currentNode.next=newNode
        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        currentNode=self.head
        while currentNode:
            #check if key is present
            if key==currentNode.data:
                return currentNode
            currentNode=currentNode.next
        return None
                 
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        temp=self.head
        prev=None
        if key==self.head.data:
            self.head=self.head.next
            return 
        while temp!=None:
            if key==temp.data:
                prev.next=temp.next
                temp.next=None
                break 
            prev=temp
            temp=temp.next
        return None
        
