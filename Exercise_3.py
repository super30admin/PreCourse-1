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
        self.head = ListNode(None)

    def print_val(self):
        """
        Helper function to debug
        """
        last_node = self.head
        while(last_node):
            print(last_node.data)
            last_node = last_node.next

    def append(self, data):
        """
        Insert a new element at the end of the list.
        Takes O(n) time.
        """
        if not self.head.data:
            self.head.data = data
            return 
        last_node = self.head
        while(last_node.next):
            last_node = last_node.next
        last_node.next = ListNode(data)
        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        if not self.head:
            return False
        last_node = self.head
        while(last_node):
            if last_node.data == key:
                return True
            last_node = last_node.next
        return False

    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        last_node = self.head
        if last_node.data == key:
           self.head = last_node.next
           return True
        while(last_node.next):
            if last_node.next.data == key:
                last_node.next = last_node.next.next 
                return True
            last_node = last_node.next
        return False
