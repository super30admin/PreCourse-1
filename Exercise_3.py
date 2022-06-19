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
        print('dta', data)
        """
        Insert a new element at the end of the list.
        Takes O(n) time.
        """
        new_node = ListNode(data)
        print(new_node)
        if self.head is None:
            self.head = new_node 
            return 
        
        last  = self.head
        while(last.next):
            last = last.next
        
        last.next = new_node

        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        if (self.size == 0):
            return None
        list = self.head
        while(list.next.data == key):
            return list.next
        
        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
       

list =  SinglyLinkedList()          
print(list.append(1))
print(list.append(2))