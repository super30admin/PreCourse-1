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
            self.head = ListNode(data)
            return 
        
        iter_node = self.head
        while iter_node.next:
            iter_node = iter_node.next
        new_node = ListNode(data)
        iter_node.next = new_node
        
        return 
        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        iter_node = self.head
        while iter_node is not None:
            value = iter_node.data
            if value == key:
                return value
            iter_node = iter_node.next
            
        return None
        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        iter_node = self.head
        
        if iter_node.data == key:
            self.head = self.head.next
            return 
        
        while iter_node.next.next is not None:
            if iter_node.next.data == key:
                temp = iter_node.next.next
                iter_node.next = temp
                return
            iter_node = iter_node.next
        
        iter_node.next = None
        return

