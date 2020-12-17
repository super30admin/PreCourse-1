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
        self.head = None # initialize 

    def append(self, data):
        """
        Insert a new element at the end of the list.
        Takes O(n) time.
        """
        node = ListNode(data)
        if self.head == None:
            self.head = node
        else:
            current_node = self.head
            while current_node != None:
                current_node = current_node.next
            current_node.next = node
        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        current_node = self.head
        for i in range(key):
            if current_node != None:
                current_node = current_node.next
        return current_node
            
        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        
        current_node = self.head
        # if LinkedList is empty
        if current_node == None:
            return None
            
        # if key = 0
        if key == 0:
            self.head = current_node.next
            current_node = None
        
        # for node in between
        lead_node = find(key-1)
        node_to_remove = lead_node.next
        lead_node.next = node_to_remove.next
        return self
