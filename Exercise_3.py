# Time Complexity : O(n)
# append: O(n)
# find: O(n)
# remove: O(n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : yes
# Any problem you faced while coding this : No

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
        
        if self.head is not None:
            current = self.head
            while current.next is not None:    
                current = current.next
            
            current.next = ListNode(data)
        else:    
            self.head = ListNode(data)
        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        if self.head is not None:
            current = self.head
            while current is not None:
                if current.data == key:
                    return "Found the matching key"
                current = current.next
            return None
        return None
        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        if self.head is not None:
            current = self.head
            pointer = self.head
            while current is not None:
                if current.data == key:
                    if current == self.head:
                        self.head = self.head.next
                        return "key removed"
                    pointer.next = current.next
                    return "key removed"
                pointer = current
                current = current.next
              
            return None
        return None
                
                
                
                
                
                
                
