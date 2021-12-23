# Time Complexity :
# append -> O(1)
# find -> O(N)
# remove -> O(N)

# Space Complexity :
# O(N) : N is the size of the  LL

# Did this code successfully run on Leetcode :
# Yes

# Any problem you faced while coding this :
# No

# Your code here along with comments explaining your approach


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
        tail = self.head
        new_node = ListNode(data)
        
        if self.head == None:
            self.head = new_node
            return
            
        while tail.next != None:
            tail = tail.next
            
        tail.next = new_node
        return
            
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        tail = self.head
        
        while tail is not None:
            if tail.data == key:
                return tail
            
            tail = tail.next
            
        return None
        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        if self.head == None:
            print("Empty List!")
            return
        
        tail = self.head
        
        if tail.data == key:
            self.head = self.head.next
            return
        
        while (tail.next != None) and (tail.next.data != key):
            tail = tail.next
         
        if tail.next == None:
            print("Element not found!")
            return
        
        tail.next = tail.next.next