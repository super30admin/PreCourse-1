# Time Complexity : O(n)
# Space Complexity : O(1)
#Did this code successfully run on Leetcode : not present on leetcode
#Any problem you faced while coding this : No
class ListNode:
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

    def append(self, data):                         
        """
        Insert a new element at the end of the list.
        Takes O(n) time.
        """
        node = ListNode(data)   
        if (self.head is None):
            self.head = node
            return 
        temp = self.head
        while (temp.next):
            temp = temp.next
        temp.next = node
        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        temp = self.head
        while (temp.next):
            if (temp.data == key):
                return temp
        return None   

        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        head = self.head
        if (head is not None):
            if (head.data == key):
                self.head = head.next
                head = None
                return 
        while (head is not None):
            if (head.data == key):
                break
            prev = head
            head = head.next
        
        if (head == None):
            return 
        prev.next = head.next
        head = None