# Time Complexity - O(n)
# Space Complexity - O(1)

class ListNode:
    """
    A node in a singly-linked list.
    """
    def __init__(self, data=None, next=None):
        self.val = data
        self.next= None
    
class SinglyLinkedList:
    def __init__(self):
        """
        Create a new singly-linked list.
        Takes O(1) time.
        """
        self.size= 0
        self.head= ListNode(0)
        
    def append(self, data):
        """
        Insert a new element at the end of the list.
        Takes O(n) time.
        """
        new_node = Node(data)
        if(self.head):
            curr = self.head
            while(curr.next):
                curr = curr.next
            curr.next = new_node
        else:
            self.head = new_node
        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        if key < 0 or key >= self.size:
            return None
        
        curr = self.head
        for _ in range(key + 1):
            curr = curr.next
            
        return curr.val
        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        if key < 0 or key >= self.size:
            return None
        
        self.size -= 1
    
        prev = self.head
        for _ in range(key):
            prev = prev.next
            
        prev.next = prev.next.next
