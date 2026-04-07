class ListNode:
    """
    A node in a singly-linked list.
    """
    def __init__(self, data=None, next=None):
        self.data=data
        self.next=next
    
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
        new_item = ListNode(data)       
        curr = self.head
        #If empty set the head
        if curr is None:
            self.head = new_item
            return 
        
        #Traverse to the end and point last element's next to the new node
        while curr.next:
            curr = curr.next
        curr.next = new_item
        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        curr = self.head
        # Traverse until data is found
        while curr:
            if curr.data == key:
                return curr
            curr=curr.next
        return None
        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        curr = self.head
        if curr is None:
            return
        if curr.data == key:
            self.head = curr.next
            return 
        #Traverse to find the element but keep the poointer one step back so we can change the next pointer 
        while curr.next:
            if curr.next.data == key:
                curr.next = curr.next.next
                return 
            curr=curr.next
        return None


