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
        new_node = ListNode(data)
        if self.head == None:
            self.head = new_node
            return new_node

        last_node = self.head
        if last_node.next != None:
            last_node = last_node.next

        last_node = new_node
        last_node.next = None
        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        curr_node = self.head
        while curr_node is not None:
            if curr_node.data == key:
                return True
            curr_node = curr_node.next
        return False

        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        curr_node = self.head

        if curr_node is not None and curr_node.data == key:
            self.head = curr_node.next
            curr_node = None
            return 
        
        previous_ele = None
        while curr_node!= None and curr_node.data != key:
            previous_ele = curr_node
            curr_node = curr_node.next

        previous_ele.next = curr_node.next
        curr_node = None
        
