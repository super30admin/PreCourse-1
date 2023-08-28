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

    # Time Complexity : O(n)
    # Space Complexity : O(1)
    def append(self, data):
        """
        Insert a new element at the end of the list.
        Takes O(n) time.
        """
        # creating a new node
        new_node = ListNode(data) 

        # checking if head is null or not before appending
        if(self.head == None):
            self.head = new_node
        else:  
            curr = self.head
            #iterating over the linked list to find the last node
            while(curr.next != None):
                curr = curr.next
            
            # Assigning last nodes next to the new node
            curr.next = new_node

        
    # Time Complexity : O(n)
    # Space Complexity : O(1)
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        curr = self.head
        # Traversing the linked list and if the element is found returning the element
        while(curr != None):
            if(curr.data == key):
                return key
            curr = curr.next

        # If the list is empty or key is not present returning None
        return None

    # Time Complexity : O(n)
    # Space Complexity : O(1)
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        if(self.head == None):
            return
        # Case 1: if the head is the key 
        curr = self.head
        if(curr.data == key):
            self.head = curr.next
            curr.next = None
            return
        
        # Case 2: if the key is middle element or last element in the linked list
        while(curr != None):
            if(curr.next != None and curr.next.data == key):
                prev = curr
                curr = prev.next
                next = curr.next 

                prev.next = next
                curr.next = None
                return
            curr = curr.next 
