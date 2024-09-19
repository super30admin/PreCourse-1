  # Time Complexity : O(n)
  # Space Complexity : O(n)
  # Did this code successfully run on Leetcode : No 
  # Any problem you faced while coding this : No 

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
        self.head = None  # Initialize the head of the list as None

    def append(self, data):
        """
        Insert a new element at the end of the list.
        Takes O(n) time.
        """
        new_node = ListNode(data)
        if self.head is None: # Check if list is empty
            self.head = new_node
        else:
            current_node = self.head 
            while current_node.next:   # Traverse to the end of the list
                current_node = current_node.next
            current_node.next = new_node # Set the new node as the last node
        print(f"Appended {data} to the list")
        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        current_node = self.head
        while current_node: # Traverse the list to find the node with the matching key
            if current_node.data == key:
                return current_node   # Return the node if found
            else:
                current_node = current_node.next
        return None 

    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        current_node = self.head
        previous_node = None

        while current_node:
            if current_node.data == key:
                if previous_node == None: # If the node to remove is the head, update the head
                    self.head = current_node.next
                else:
                    previous_node.next =  current_node.next  # Otherwise, bypass the current node
                return True # returning success  
            previous_node = current_node # update the currect node to run while run
            current_node = current_node.next

        return False # returning no node found

'''
# usage Example 
linked_list = SinglyLinkedList()
linked_list.append(1)  # Add 1 to the list
linked_list.append(2)  # Add 2 to the list
linked_list.append(3)  # Add 3 to the list

node = linked_list.find(2)
if node:
    print("Found:", node.data)  # Should print "Found: 2"
else:
    print("Not found")

# Remove an element
if linked_list.remove(2):
    print("Element removed")  # Should print "Element removed"
else:
    print("Element not found")
'''