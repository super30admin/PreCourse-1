#Time Complexity: O(n) for all operations: append, find and remove
#Space Complexity: O(1)

class ListNode:
    """
    A node in a singly-linked list.
    """
    def __init__(self, data=None, next=None):
        self.data = None
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
        if not self.head:
            self.head = new_node
        else:
            curr_node = self.head
            while(curr_node.next):
                curr_node = curr_node.next
            curr_node.next = new_node
        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        
        curr_node = self.head
        while(curr_node):
            if curr_node.data == key:
                return curr_node.data
            curr_node = curr_node.next
                
        return None

        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        if not self.head:
            return None
        elif self.head.data == key:
            self.head = self.head.next
        else:
            prev_node = self.head
            curr_node = self.head.next
            while(curr_node):
                if curr_node.data == key:
                    prev_node.next = curr_node.next
                    curr_node.next = None
                    break
                else:
                    prev_node = curr_node
                    curr_node = curr_node.next
            


