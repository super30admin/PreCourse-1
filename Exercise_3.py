#Space Complexity: O(n) where n is the number of elements
#Time Complexity: O(n)
#The code did run successfully for all the functions

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
        if self.head is None:                       #simply adding new node if the linked list is not yet created
            self.head = ListNode(data)              
            return 
        
        iter_node = self.head
        while iter_node.next:                       #iterating until we reach the end
            iter_node = iter_node.next
        new_node = ListNode(data)                   #creating new node with the 'data' value
        iter_node.next = new_node                   #adding at the end of the list
        
        return 
        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        iter_node = self.head
        while iter_node is not None:                #iterating until we reach the end
            value = iter_node.data
            if value == key:                        #checking if value matches key
                return value
            iter_node = iter_node.next
            
        return None
        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        iter_node = self.head
        
        if iter_node.data == key:                       
            self.head = self.head.next              #if the element to be removed is head then simply assigning the new head as the current's next node
            return 
        
        while iter_node.next.next is not None:
            if iter_node.next.data == key:
                temp = iter_node.next.next          #if the element is in the middle then we are accounting for its next node
                iter_node.next = temp               #we are allocating current node's next to the elimiting node's next 
                return
            iter_node = iter_node.next
        
        iter_node.next = None                       #handling the condition where the element to be removed is the last node
        return

