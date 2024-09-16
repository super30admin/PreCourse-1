# Time Complexity : O(n) for all operations
# Space Complexity : O(1)
#Any problem you faced while coding this : Trying to understand the pre-defined functions initially

#Approach: Commented the approach in the code
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
        new_node = ListNode(data)
        #If the LinkedList is empty then the new node is appended as head of the list
        if not self.head:
            self.head = new_node
        return

        #If the LinkedList is not empty then we have to traverse till the last node 
        current = self.head
        while current.next:
            current = current.next
        
        #Then append the new node
        current.next = new_node
        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        #Assign current as pointer to head of the LinkedList
        current = self.head
        #Traverse through the linked list till it is empty
        while current: 
            #If data matches with the key in the current node then return it
            if current.data == key: 
                return current.data
            #Else update the current to next node
            current = current.next 
        #return none if the key is not found in the LinkedList
        return None 
        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        #Assign current pointer to head and previous as none (Before head node)
        current = self.head
        previous = None

        #If the key to be removed is the head node
        if  current and current.data == key:
            self.head = current.next
        return

        #If the key is not head then traverse the LinkedList
        while current and current.data != key:
            previous = current
            current = current.next 

        #If key is not found in any of the nodes then return None
        if not current:
            return None
        
        #If key is found then remove it by updating the previous and current pointers
        previous.next = current.next