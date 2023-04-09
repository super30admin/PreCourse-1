class ListNode:
    """
    A node in a singly-linked list.
    """
    def __init__(self, data=None, next=None):
    
class LinkedList:
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
        if self.head is None:          
            self.head = ListNode(data)
        else:                           
            temp_node = self.head
            new_node = ListNode(data)
            while temp_node.next is not None:
                temp_node = temp_node.next
            temp_node.next = new_node
        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        present_node = self.head

        while present_node is not None:   
            if present_node.data == key:
                return present_node
            present_node = present_node.next

        return None
        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        if self.head.data == key:       
            self.head = self.head.next
            return

        elif self.head is None:         
            return

        else:                          
            present_node = self.head.next
            previous_node = self.head
            while previous_node.next is not None:
                if present_node.data == key:
                    previous_node.next = present_node.next
                    return

        return
