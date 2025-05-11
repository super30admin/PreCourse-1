# Time Complexity : append - O(n); find - O(n); remove - O(n); init - O(1)
                    
# Space Complexity : append - O(n) since it has to traverse through all the nodes to append 
# find - O(n); remove - O(n) for the same reason as above 
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
        if self.head is None:
            self.head = ListNode(data)
            return
        temp = self.head 
        while temp.next != None:
            temp = temp.next 
        
        new_node = ListNode(data)
        temp.next = new_node
        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        temp = self.head 
        while temp is not None:
            if temp.data == key:
                return temp 
            temp = temp.next 
        
        return None
        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        if self.head is None:
            return None
        temp = self.head 
        prev = temp
        while temp is not None:
            if temp.data == key:
                prev.next = temp.next 
                return 
            prev = temp 
            temp = temp.next  
        return None
