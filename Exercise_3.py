#Time complexity: O(n) for append, O(n) for find, O(n) for remove
#Space complexity: O(n) for Linked List
class ListNode:
    """
    A node in a singly-linked list.
    """
    def __init__(self, data=None, next=None):
        self.data = data  # Data of the node
        self.next = next  # Pointer to the next node

class SinglyLinkedList:
    def __init__(self):
        """
        Create a new singly-linked list.
        Takes O(1) time.
        """
        self.head = None  # Head of the linked list

    def append(self, data):
        """
        Insert a new element at the end of the list.
        Takes O(n) time.
        """
        new_node = ListNode(data)  # Creating  a new node with the given data
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
                return current  # Element found, returning the node
            current = current.next
        return None  # Element not found, return None

    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        if self.head is None:
            return
        
        if self.head.data == key:       # If the head node is the node to be removed
            self.head = self.head.next   # Removing the head node
            return
        
        current = self.head
        while current.next:
            if current.next.data == key:     # If the next node is the node to be removed
                current.next = current.next.next  # Skipping the node to remove it
                return
            current = current.next

# Example usage
linked_list = SinglyLinkedList()       # Creating a linked listS
linked_list.append(1)
linked_list.append(2)                   #
linked_list.append(3)
    
key_to_find = 8
found_node = linked_list.find(key_to_find)
if found_node:
        print(f"Node with data {key_to_find} found in the list.")
        linked_list.remove(key_to_find)
        print(f"Node with data {key_to_find} removed from the list.")
else:
        print(f"Node with data {key_to_find} not found in the list.")