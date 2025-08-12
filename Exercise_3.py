"""
Time Complexity
isEmpty(): O(1)
append(): Worst Case- O(n)
find(): Worst Case- O(n)
remove(): Worst Case- O(n)
size(): O(1)
show(): O(n)
Space Complexity: O(n)
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
        self.size = 0

    def isEmpty(self): # Encapsulation; O(1)
        return self.head is None
    
    def append(self, data):
        """
        Insert a new element at the end of the list.
        Takes O(n) time.
        """
        new_node = ListNode(data)
        if self.isEmpty(): # O(1)
            self.head = new_node
        else:
            current = self.head # O(n)
            while current.next:
                current = current.next
            current.next = new_node
        self.size += 1
        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        current = self.head
        while current:
            if current.data == key:
                return f"Found {current.data}"
            current = current.next
        return None 
        
    def remove(self, key): 
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.

        Edge cases: list is empty, head is the element, element not found
        """
        if self.isEmpty(): #O(1)
            return "List is empty"
        
        current = self.head
        if current.data == key: # O(1)
            self.head = current.next
            self.size -= 1
            return f"{key} removed"
        
        while current.next: # O(n)
            if current.next.data == key:
                current.next = current.next.next
                self.size -= 1
                return f"{key} removed" # only remove first occurence
            current = current.next
        
        return "Key not found" # O(n)
        

    def size(self): # O(1) time complexity
        return self.size
    
    def show(self): # O(n)
        return str(self)
    
    def __str__(self):
        items = []
        current = self.head
        while current:
            items.append(str(current.data))
            current = current.next
        return "Singly Linked List: " + " --> ".join(items)


l = SinglyLinkedList()
print(l.remove(4))
l.append(6)
l.append(8)
l.append(9)
print(l)
print(l.remove(0))
print(l.remove(8))
print(l.find(6))
print(l)
print(l.show())