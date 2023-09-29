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
    # Space Complexity : O(1)
    
    def append(self, data):
        """
        Insert a new element at the end of the list.
        Takes O(n) time.
        """
        if not self.head:
            self.head = ListNode(data=data)
            return
        
        current = self.head
        while current.next:
            current = current.next
        
        current.next = ListNode(data=data)
    # Space Complexity : O(1)
    
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
    # Space Complexity : O(1)
        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        current = self.head
        if not current:
            return
        
        if current.data == key:
            self.head = current.next
            return
        
        while current.next:
            if current.next.data == key:
                current.next = current.next.next
                return
            current = current.next
    # Space Complexity : O(1)

# Usage
linked_list = SinglyLinkedList()
linked_list.append(1)
linked_list.append(2)
linked_list.append(3)

print(linked_list.find(2))  # Returns 2
linked_list.remove(2)
print(linked_list.find(2))  # Returns None
