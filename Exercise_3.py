# Time Complexity:
# append: O(n) 
# find: O(n) 
# remove: O(n)
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
        new_node = ListNode(data)
        if self.head is None:
            self.head = new_node
            return
        
        last_node = self.head
        while last_node.next:
            last_node = last_node.next
        last_node.next = new_node
        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        current = self.head
        while current:
            if current.data == key:
                return current
            current = current.next
        return None
        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        current = self.head
        
        if current and current.data == key:
            self.head = current.next
            current = None
            return
        
        prev = None
        while current and current.data != key:
            prev = current
            current = current.next
        
        if current is None:
            return
        
        prev.next = current.next
        current = None

# Example :
# new singly-linked list
sll = SinglyLinkedList()

# Append elements to the list
sll.append(1)
sll.append(2)
sll.append(3)

# Find an element
result = sll.find(2)
if result:
    print("Element found:", result.data)
else:
    print("Element not found")

# Remove an element
sll.remove(2)

# Check the contents of the list
current = sll.head
while current:
    print(current.data)
    current = current.next
