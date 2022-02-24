from ast import While
from email import header


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
        self.head = ListNode()

    def append(self, data):
        """
        Insert a new element at the end of the list.
        Takes O(n) time.
        """
        current_node = self.head
        while current_node.next != None:
            current_node = current_node.next
        current_node.next = ListNode(data)
        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        current_node = self.head
        while current_node != None:
            if current_node.data == key:
                return current_node
            current_node = current_node.next
        return None
        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        current_node = self.head
        prev_node = None
        while current_node != None:
            if current_node.data == key:
                prev_node.next = current_node.next
            prev_node = current_node
            current_node = current_node.next
    
    def print_list(self):
        current_node = self.head
        while current_node!= None:
            print(current_node.data)
            current_node = current_node.next

# x = SinglyLinkedList()
# x.append(1)
# x.append(2)
# x.append(3)
# x.append(4)
# x.print_list()
# print(x.find(3).data)
# x.remove(2)
# x.print_list()