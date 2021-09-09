# from Exercise_2 import Node
#  Time Complexity for insertion, finding and removing: O(n)
#  Space Complexity : O(n)
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
        newNode = ListNode(data)
        if self.head:
            current = self.head
            while(current.next):
                current = current.next
            current.next = newNode
        else:
            self.head = newNode
        
    def find(self, key):

        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        current = self.head
        while(current):
            if current.data == key:
                return current
            current = current.next
        return None
        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        current = self.head
        if current.data == key:
            self.head = self.head.next
        else:
            while current:
                next_node = current.next
                if next_node.data == key:
                    current.next = next_node.next
                    return "Removed "+str(next_node.data)
                else:
                    current = current.next

