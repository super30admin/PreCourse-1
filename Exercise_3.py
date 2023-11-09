# Time complexity: O(n)
# Space complexity: O(n)

class ListNode:
    """
    A node in a singly-linked list.
    """
    def __init__(self, data=None, next=None):
        self. data = data
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
        node = ListNode(data)           # Create a new node with given data
        if self.head == None:           # If head in empty, add new node as the head.
            self.head = node
            return None
        if self.head.next == None:
            self.head.next = node
            return None
        curr = self.head                # Current node being pointed.
        while curr.next != None:        # Traverse the linked list to the end.
            curr = curr.next
        curr.next = node                # Add the new node as the last node in the list.
        return None
        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        if self.head.data == key:          # Check if the first element has the key.
            return self.head
        curr = self.head
        while curr.next != None:       
            if curr.data == key:
                return curr
            curr = curr.next               # Traverse the linked list.
        return None                        # Return None if the key is not found.
        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        if self.head == None:                    # If the list already empty.
            return None
        if self.head.data == key:       
            self.head = self.head.next           # If the head is the key, make next node as head.
            return None

        curr = self.head

        while curr.next != None:
            if curr.next.data == key:                  
                curr.next = curr.next.next      # Removing the element with the key from the list.
                return None
            curr = curr.next
        return None

