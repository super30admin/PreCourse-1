class ListNode:
    """
    A node in a singly-linked list.
    """
    def __init__(self, data=None, next=None):
        self.data=data # The data value stored in the node
        self.next=next # Reference to the next node (or None if no next node)
    
class SinglyLinkedList:
    def __init__(self):
        """
        Create a new singly-linked list.
        Takes O(1) time.
        """
        self.head = None # Initially, the list is empty
      

    def append(self, data):
        """
        Insert a new element at the end of the list.
        Takes O(n) time.
        """
        new_node = ListNode(data)  # First Create a new node with the given data
        # Now place that node at the end of list
        # if this is first node
        if not self.head:
            # this is first node of the list
            self.head = new_node
        else:
            # link list has some values, need to iterate to the end and assign nodes
            current = self.head # pointer to iterate
            while(current.next):
                current = current.next
            
            # now current is our end node
            # assign new node to the end of current node
            current.next = new_node
        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        
        # initialize the pointer which we call current
        current = self.head
        
        while(current):
            if current.data == key:
                # key found
                return current.data
            else:
                # increment current
                current = current.next
        
        # if we are outside while loop that means, list is either empty or key is not present in the list
        # in this case return None
        return None
        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
       
        current = self.head
        
        # If the list is empty, return False
        if not current:
            return False
        
        # Special case: If the head node is the one to be removed
        if current.data == key:
            self.head = current.next  # Move the head pointer to the next node
            return True
        
        left = ListNode()
        # Traverse the list to find the node to remove
        while current:
            if current.data == key:
                left.next = current.next  # Bypass the node to be removed
                return True
            left = current # move left
            current = current.next # increment current
        
        # Return False if the key was not found
        return False
            
    
    def display(self):
        """
        Helper method to display the list as a string (for testing).
        """
        elements = []
        current = self.head
        while current:
            elements.append(current.data)
            current = current.next
        return "->".join(map(str, elements))
