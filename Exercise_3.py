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
        if self.head == None:
            self.head = ListNode(data)
        else:
            current_node = self.head
            while(current_node.next != None):       #loop until last element is reached
                current_node = current_node.next

            current_node.next = ListNode(data)

        """
        Insert a new element at the end of the list.
        Takes O(n) time.
        """
        
    def find(self, key):

        if self.head == None:
            None
        else:
            current_node = self.head

            while(current_node.data != key or current_node.next != None):      #go until target node or last node
                current_node = current_node.next


            if current_node.data == key:
                current_node
            else:
                None
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        
    def remove(self, key):
        current_node = self.head
        while(current_node.next.data != key or current_node.next != None):
            current_node = current_node.next

        if current_node.next.data == key:
            remove_node = current_node.next
            current_node.next = remove_node.next
            remove_node.next = None
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
#edited