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
        if self.head is None:           # checking a corner case of linked list being empty
            self.head = ListNode(data)
        else:                           # a normal traversal and append to the end of the tail node
            temp_node = self.head
            new_node = ListNode(data)
            while temp_node.next is not None:
                temp_node = temp_node.next
            temp_node.next = new_node
        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        curr_node = self.head

        while curr_node is not None:    # a normal traversal and checking first match
            if curr_node.data == key:
                return curr_node
            curr_node = curr_node.next

        return None
        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        if self.head.data == key:       # checking first corner case of first node to be removed
            self.head = self.head.next
            return

        elif self.head is None:         # checking second corner case of linked list being empty
            return

        else:                           # otherwise maintain two pointers and remove the required node
            curr_node = self.head.next
            prev_node = self.head
            while prev_node.next is not None:
                if curr_node.data == key:
                    prev_node.next = curr_node.next
                    return

        return
