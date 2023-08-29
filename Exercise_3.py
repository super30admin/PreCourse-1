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
        current = self.head
        while current.next is not None:
            current = current.next
        current.next = new_node
        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        current = self.head
        while current is not None:
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
        while current.next is not None:
            if current.next.data == key:
                current.next = current.next.next
                return
            current = current.next

linked_list = SinglyLinkedList()
linked_list.append(10)
linked_list.append(20)
linked_list.append(30)

# Find an element
found_node = linked_list.find(20)
if found_node:
    print("Found:", found_node.data)
else:
    print("Element not found")

    # Remove an element
linked_list.remove(20)
found_node = linked_list.find(20)
if found_node:
    print("Found:", found_node.data)
else:
    print("Element not found")

# Print the linked list
current = linked_list.head
while current:
    print(current.data)
    current = current.next

