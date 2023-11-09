class ListNode:
    """
    A node in a singly-linked list.
    """
    def __init__(self, data=None, next=None):
        self.data = data
        self.next = None
    
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
            self.head = ListNode(data, None) # Creating a new node and returning the head
            return self.head
        else:
            curr = self.head
            while curr.next is not None:
                curr = curr.next
            curr.next = ListNode(data, None) # Adding a new node at the end of linked list
        return self.head

        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        if self.head is None:
            return None
        curr = self.head
        while curr is not None:
            if curr.data == key: # Returning the element if key found in the linked list
                return curr
            curr = curr.next
        return None
        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        if self.head is None:
            return None
        curr = self.head
        while curr.next is not None:
            if curr.data == key: 
                prev = curr.next # Pointing the previous elemnt to next element of matching element key
            prev = curr
            curr = curr.next
        if curr.data == key: 
                prev.next = None
        return self.head