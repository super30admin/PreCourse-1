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
        else:
         current = self.head
         while current.next:
            current = current.next
         
         current.next = new_node
        
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
        if self.head is None:
            return
        if self.head.data == key:
         self.head = self.head.next
         return
        current = self.head
        prev = None
        while current:
         if current.data == key:
            prev.next = current.next
            return
        prev = current
        current = current.next

# Create a singly-linked list
my_list = SinglyLinkedList()

# Append elements to the list
my_list.append(1)
my_list.append(2)
my_list.append(3)

# Print the elements in the list
current = my_list.head
while current:
    print(current.data)
    current = current.next

# Find an element in the list
found_node = my_list.find(2)
if found_node:
    print("Found:", found_node.data)
else:
    print("Element not found")

# Remove an element from the list
my_list.remove(2)

# Print the updated list
current = my_list.head
while current:
    print(current.data)
    current = current.next
