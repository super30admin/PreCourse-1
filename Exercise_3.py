
# Explanation
# append - Create a node object, if head is none, set new node as head and return, if has elements iterate until until we find tail and add the node
# find - simple iteration over list and return value when found, note does not change the list 
# remove - curr points to head and prev is None node, when match is found, if prev exists, set prev to next of curr and iterate ahead if not found

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
        self.size = 0

    def append(self, data):
        """
        Insert a new element at the end of the list.
        Takes O(n) time.
        """
        new_node = ListNode(data)
        if self.head == None:
            self.head = new_node
            return
        
        current = self.head
        while current.next != None:
            current = current.next
        current.next = new_node

        self.size += 1

        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        temp = self.head

        while temp:
            if temp.data == key:
                return temp.data
            temp = temp.next
        return None # element not found

        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        prev = ListNode()
        curr = self.head
        while curr:
            if curr.data == key:
                if prev:
                    prev.next = curr.next
                else:
                    self.head = curr.next
            prev = curr
            curr = curr.next
