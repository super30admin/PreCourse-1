class Node:
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
        self.count = 0

    def append(self, data):
       
        """
        Insert a new element at the end of the list.
        Takes O(n) time.
        """
        if self.head == None:
            self.head = Node(data)
            self.count += 1
        else:
        temp = self.head
            while temp.next is not None:
                temp = temp.next
            new_node = Node(data)
            temp.next = new_node
            self.count += 1
        return
        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        if key >= self.count or key < 0:
            return None
        if self.head is None:
            return None
 
        temp = self.head
        for i in range(key):
            temp = temp.next
            
        return temp.data
        
        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        if key >= self.count or key < 0:
            return 
        if self.head is None:
            return
        temp = self.head
        if key == 0:
            self.head = temp.next
        
        for i in range(key-1):
            temp = temp.next
        temp.next = temp.next.next
        self.count -= 1
        return
            
