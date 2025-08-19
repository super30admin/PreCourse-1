"""
Time Complexity: Linear O(1)
Append: O(1) 
Find: O(N) (Linear search)
Remove: O(N) (Linear scan to remove)

Space Complexity: O(n) for n nodes (constant for each node)
"""
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
        self.tail = None

    def append(self, data):
        """
        Insert a new element at the end of the list.
        Takes O(n) time.
        
        Notes: 
        When inserting a new element
        """
        new_node = ListNode(data)
        if self.head == None:
            self.head = new_node 
            self.tail = new_node
        else: 
            self.tail.next = new_node
            self.tail = new_node

                
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        cur = self.head
        
        while curr: 
            if curr.data == key: 
                return curr
            else: 
                curr = curr.next
        return None
        
        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        prev, curr = None, self.head
        
        while curr and curr.data != key: 
            prev = curr
            curr = curr.next 
            
        if curr == None: 
            return False

        if prev == None: 
            self.head = curr.next
        else: 
            prev.next = curr.next
            
        if curr == self.tail: 
            self.tail = prev
            
        if self.head == None: 
            self.tail = None
            
        return True
    

        
        
