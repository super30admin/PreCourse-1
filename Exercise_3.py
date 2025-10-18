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
        self.size = 0

    def append(self, data):
        """
        Insert a new element at the end of the list.
        Takes O(n) time.
        """
        new_node = ListNode(data)
        # If the list is empty, set the head to the new node
        if not self.head:
            self.head = new_node
            self.size += 1
            return
        # Otherwise, traverse to the end of the list and insert the new node
        last_node = self.head
        while last_node.next:
            last_node = last_node.next
        last_node.next = new_node
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
                return current
            current = current.next
        return None
        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        # If the list is empty, nothing to remove
        if not self.head:
            return
        # Create a previous node to keep track of the node before the current one
        # Dummy node to handle edge case of deleting head node
        previous = ListNode(None, self.head)
        while previous.next:
            if previous.next.data == key:
                previous.next = previous.next.next
                self.size -= 1
                break
            previous = previous.next
        # If the head node itself holds the key to be deleted
        # then update the head to the next node
        if previous == self.head:
            self.head = previous.next