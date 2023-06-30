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
        if self.head == None:
            self.head = ListNode(data=data, next=None)
        else:
            new_node = ListNode(data=data, next=None)
            while self.head.next != None:
                self.head = self.head.next
            self.head.next = new_node        
        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        if self.head == None:
            return self.head
        else:
            node = self.head
            while node and node.data != key:
                node = node.next
            return node
        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        if self.head == None:
            return self.head
        else:
            node = self.head
            while node and node.data!= key:
                node = node.next
            next_node = node.next
            if next_node != None:
                node.data = next_node.data
                node.next = next_node.next
                next_node.next = None
                del(next_node)
            