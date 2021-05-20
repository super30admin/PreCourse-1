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
            self.head = ListNode(data)

        else:
            new_node = ListNode(data)
            new_node.next = self.head
            self.head = new_node

    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        current_data = self.head
        found = False
        while current_data and found is False:
            if current_data.get_data() == key:
                found = True
            else:
                current_data = current_data.get_next()
        if current_data is None:
            return None
        return current_data
        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        current_node = self.head
        previous_node = None
        found = False
        while current_node and found is False:
            if current_node.get_data() == key:
                found = True
            else:
                previous_node = current_node
                current_node = current_node.get_next()
        if current_node is None:
            print("Key not in list")
        if previous_node is None:
            self.head = current_node.get_next()
        else:
            previous_node.set_next(current_node.get_next())