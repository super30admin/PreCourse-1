# Time Complexity:
#   append(data) : O(n) - We need to traverse to the end to insert the new node.
#   find(key)    : O(n) - We may have to traverse the entire list to find the key.
#   remove(key)  : O(n) - We may need to traverse the list to find and remove the key.

# Space Complexity: O(n) - Space grows linearly with the number of elements in the list.

# Did this code successfully run on Leetcode?
# Not applicable, but it runs successfully in local environments.

# Any problem you faced while coding this:
# No issues encountered.

class ListNode:
    """
    A node in a singly-linked list.
    """
    def __init__(self, data=None, next=None):
        self.data = data  # Store the data value
        self.next = next  # Store the reference to the next node

class SinglyLinkedList:
    def __init__(self):
        """
        Create a new singly-linked list.
        Takes O(1) time.
        """
        self.head = None  # Initialize the head of the list to None

    def append(self, data):
        """
        Insert a new element at the end of the list.
        Takes O(n) time.
        """
        new_node = ListNode(data)  # Create a new node with the given data
        if self.head is None:  # If the list is empty, set the head to the new node
            self.head = new_node
            return
        # Traverse to the end of the list
        current = self.head
        while current.next:
            current = current.next
        # Add the new node at the end
        current.next = new_node

    def find(self, key):
        """
        Search for the first element with `data` matching `key`. 
        Return the element or `None` if not found.
        Takes O(n) time.
        """
        current = self.head  # Start from the head of the list
        while current:  # Traverse through the list
            if current.data == key:  # If data matches the key, return the node
                return current
            current = current.next  # Move to the next node
        return None  # If the key is not found, return None

    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        current = self.head  # Start from the head
        previous = None  # Keep track of the previous node

        while current:  # Traverse through the list
            if current.data == key:  # If data matches the key
                if previous is None:  # If it's the first node, update the head
                    self.head = current.next
                else:  # Otherwise, bypass the current node
                    previous.next = current.next
                return  # Exit after removing the node
            previous = current  # Move the previous pointer
            current = current.next  # Move to the next node

# Your code here along with comments explaining your approach:
# - `ListNode` defines each node of the linked list.
# - `SinglyLinkedList` manages the linked list.
# - `append(data)` adds a new node at the end.
# - `find(key)` searches for a node with matching data.
# - `remove(key)` removes the first occurrence of a node with matching data.

# Testing the SinglyLinkedList
sll = SinglyLinkedList()
sll.append(1)
sll.append(2)
sll.append(3)

# Find a node with value 2
node = sll.find(2)
print("Found:", node.data if node else "Not found")  # Output: Found: 2

# Remove the node with value 2
sll.remove(2)

# Try to find the removed node
node = sll.find(2)
print("Found:", node.data if node else "Not found")  # Output: Not found
