# Time Complexity : O(N)
# Space Complexity : O(N)
# Did this code successfully run on Leetcode :
# Any problem you faced while coding this : None

class ListNode:
    """
    A node in a singly-linked list.
    """
    def __init__(self, data=None, next=None):
        self.data = data
        self.next= next
    
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
            node= ListNode(data)
            self.head= node
            return
        curr = self.head
        while curr.next is not None:
            curr = curr.next
        node = ListNode(data)
        curr.next = node
        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        curr = self.head
        while curr is not None:
            if curr.data is key:
                return key
            curr = curr.next
        return None
        
        
        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        if self.head is None:
            self.head = None
            return
        curr = self.head
        while curr.next.data != key:
            curr = curr.next
        curr.next = curr.next.next
        
    def __str__(self):
        curr = self.head
        array = []
        while curr is not None:
            array.append(str(curr.data))
            curr = curr.next
        s = "->".join(array)
        return s
        
ll = SinglyLinkedList()
ll.append(2)
ll.append(3)
ll.append(4)
print(ll.find(3))
print(ll.find(-1))
ll.remove(3)
print(ll)
        
        
        
        
        
        
        
        
        
        
        
        
