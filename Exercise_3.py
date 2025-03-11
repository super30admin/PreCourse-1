# Time Complexity: (have mentioned again even though mentioned in the docstring)
# __init__(): O(1) 
# append() : O(n)
# find() : O(n)
# remove() : O(n)
# Space Complexity: O(1) 
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
        # Create a new node with the provided data
        new_node = ListNode(data)

        # If the list is empty, make the new node the head 
        if self.head is None:
            self.head = new_node
            return

        # Otherwise, traverse to the end of the list
        current = self.head
        while current.next:
            current = current.next

        # Set the next of the last node to the new node 
        current.next = new_node
        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        # Start from the head 
        current = self.head 

        # Traverse the list
        while current:
            # If the current node's data matches the key, return the node 
            if current.data ==  key:
                return current
            current = current.next 

        # If we exit the loop, the key was not found
        return  None
        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        # Handle Empty list case
        if self.head is None:
            return 

        # Handle case where the head contains the key
        if self.head.data == key:
            self.head = self.head.next 
            return 
        
        # Traverse the list to find the node with the key
        current = self.head
        while current.next and current.next.data != key:
            current = current.next

        # If we found a node with the key, remove it
        if current.next:
            current.next = current.next.next


# Example usage:
if __name__ == "__main__":
    # Create a new singly linked list
    linked_list = SinglyLinkedList()
    
    # Append some elements
    linked_list.append(1)
    linked_list.append(2)
    linked_list.append(3)
    linked_list.append(4)
    
    # Print the list
    print("Original list:")
    print(linked_list)
    
    # Find an element
    node = linked_list.find(3)
    if node:
        print(f"Found node with data: {node.data}")
    
    # Remove an element
    linked_list.remove(2)
    
    # Print the updated list
    print("List after removing 2:")
    print(linked_list)