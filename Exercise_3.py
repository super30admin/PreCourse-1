class ListNode:
    """
    A node in a singly-linked list.
    """
    def __init__(self, data=None, next=None):
        self.data = data # Data in the node
        self.next = next # Reference to the next node in the list
    
class SinglyLinkedList:
    def __init__(self):
        """
        Create a new singly-linked list.
        Takes O(1) time.
        """
        self.head = None # Head of the list set initially to None

    def append(self, data):
        """
        Insert a new element at the end of the list.
        Takes O(n) time.
        """
        if not self.head:
            self.head = ListNode(data=data) # Initialize new node if head is empty
        else:
            # Traverse the list to find the last node and append new node
            current = self.head
            while current.next:
                current = current.next
            current.next = ListNode(data=data)
        
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
        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        current = self.head
        previous = None
        while current:
            if current.data == key:
                if previous:
                    previous.next = current.next
                else:
                    self.head = current.next
                return True
            previous = current
            current = current.next
        return False
    
# Initializing a new SinglyLinkedList
sll = SinglyLinkedList()

# Appending elements to the list
sll.append(4)
sll.append(5)
sll.append(6)
sll.append(7)

# Test case 1: Find an element that exists
print("Find 5:", sll.find(5))

# Test case 2: Find an element that does not exist
print("Find 10:", sll.find(10))

# Test case 3: Remove an element from the middle
print("Remove 5:", sll.remove(5))
print("Find 5 after removal:", sll.find(5))

# Test case 4: Remove the first element (head)
print("Remove 4:", sll.remove(4))
print("Find 4 after removal:", sll.find(4))

# Test case 5: Remove the last element
sll.append(8)  # Append a new element to become the last
print("Remove 8:", sll.remove(8))
print("Find 8 after removal:", sll.find(8))

# Test case 6: Attempt to remove an element not in the list
print("Remove 10:", sll.remove(10))  # Expected Output: Remove 10: False

# Test case 7: Check the list after several operations
print("Find 6:", sll.find(6))
print("Find 7:", sll.find(7))

# Test case 8: Append and then find a new element
sll.append(9)
print("Find 9:", sll.find(9))
