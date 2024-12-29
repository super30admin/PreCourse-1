class ListNode:
    """
    A node in a singly-linked list.
    """
    def __init__(self, data, next):
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
        new_node = ListNode(data)
        if self.head is None:
            # list is empty
            self.head = new_node
            return
        
        current = self.head
        while current.next is not None:
            current = current.next
        
        current.next = new_node

        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        if self.head is None:
            # list is empty
            return
        
        current = self.head
        while current is not None:
            if current.data == key:
                return current
            current = current.next

        return None
        
    
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        if self.head is None:
            # list is empty
            return
        
        # if we have to remove the head node
        if self.head.data == key:
            self.head = self.head.next
            return

        current = self.head

        while current.next is not None:
            if current.next.key == key:
                current.next = current.next.next
                return
            current = current.next

        return
    




        
            


