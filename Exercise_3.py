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
        if self.head is None:
            self.head = ListNode(data,next)   ## Create a new node and make it the head if the list is empty
            return
        itr = self.head
        while itr.next:
            itr = itr.next
        itr.next =  ListNode(data,next)      # Create a new node and add it to the end of the list
        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """

        itr = self.head
        while itr:
            if itr.data == key:     # Check if the current node's data matches the key
                return itr      #Return the node if found
            itr = itr.next
        return None
        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        if self.head is None:
            return

        if self.head.data == key:
            self.head = self.head.next  # If the key is in the head node, update the head to the next node
            return

        prev = self.head
        curr = self.head.next
        while curr:
            if curr.data == key:
                prev.next = curr.next      # removing the current node , by linking the next node address to previous node
                return
            prev = curr
            curr = curr.next
    