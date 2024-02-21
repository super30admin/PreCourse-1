# Time Complexity : O(n)
# Space Complexity : O(n)
# Did this code successfully run on Leetcode :
# Any problem you faced while coding this : Taking time for implementation


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
    # to insert the element at the end of list, we moved to the end of node where current.next 
    #is Null then will add the element at end
    def append(self, data):
        """
        Insert a new element at the end of the list.
        Takes O(n) time.
        """
        newNode = ListNode(data)
        if self.head is None:
            self.head = newNode
            return
        current = self.head
        while current.next:
            current = current.next
        current.next = newNode

    def print_LL(self):
        element = []
        current = self.head
        while current:
            element.append(current.data)
            current = current.next
        return element

    # to Search for the first element with `data` matching 'key', we go through all the elements and 
    # check if current.data matches with key  
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        current = self.head
        while current:
            if current.data == key:
                return current.data
            current = current.next
        return None

    #first search element which matches the 'key' then will change current pointing address to the next node    
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        if not self.head:
            return
        
        if self.head.data == key:
            self.head = self.head.next
            return
        
        current = self.head
        while current.next:
            if current.next.data == key:
                current.next = current.next.next
                return
            current = current.next

s = SinglyLinkedList()
s.append(1)
s.append(2)
s.append(3)

print(s.print_LL())

print(s.find(2))
s.remove(2)
print(s.print_LL())