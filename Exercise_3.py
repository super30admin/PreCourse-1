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
        current_node = self.head

        while(current_node and current_node.next):
            current_node = current_node.next
        
        new_node = ListNode(data=data)
        
        if(current_node):
            current_node.next = new_node
        else:
            self.head = new_node

        return new_node

    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        current_node = self.head

        while(current_node and current_node.next and current_node.data!=key):
            current_node = current_node.next

        if(current_node and current_node.data==key):
            return current_node

        return None    
        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        previous_node = None
        current_node = self.head

        while(current_node and current_node.next and current_node.data!=key):
            previous_node = current_node
            current_node = current_node.next

        if(current_node and current_node.data==key):
            previous_node.next = current_node.next
            return current_node

        return None    