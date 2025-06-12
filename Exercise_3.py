class ListNode:
    """
    A node in a singly-linked list.
    """

    # Implement Singly Linked List.
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
        new_node= ListNode(data)
        if self.head is None:
            self.head= new_node
        else:
            current=self.head
            while current.next:
                current = current.next
            current.next = new_node
        
        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        current=self.head
        while current.next:
            if current.data == key:
                return True
            current = current.next
        return False
            

    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        current=self.head
        prev= None
        while current.next:
            if current.data == key:
                if prev:
                    prev.next=current.next
                else:
                    self.head=current.next

                return True
            prev=current
            current = current.next
            
        return False
            

