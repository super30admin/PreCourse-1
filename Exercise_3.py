# Time Complexity : O(1)
# Space Complexity : O(n)
class ListNode:
    """
    A node in a singly-linked list.
    """
    def __init__(self, data=None, next=None):
        self.data= data
        self.next= None
    
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
        new_node= ListNode(data)
        if self.head is None:
            self.head = new_node
            return
        end= self.head
        while (end.next):
            end = end.next
        end.next = new_node


        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        node= self.head
        while node is not None:
            if node.data == key:
                return node
            node= node.next
        return None
        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        curr_node = self.head
        if curr_node is not None:
            if curr_node.data == key:
                curr_node = None
                return
        else:
            return None
        
        while (curr_node is not None):
            if curr_node.data == key:
                break
            prev_node= curr_node
            if curr_node.next is not None:
                curr_node = curr_node.next
            else: 
                return
        prev_node.next = curr_node.next
        curr_node= None