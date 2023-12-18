class ListNode:
    """
    A node in a singly-linked list.
    """
    def __init__(self, data=None, next=None):
        self.data = data
        self.next = ""
    
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
        new_data = ListNode(data, self.head)
        self.head = new_data

        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        iterator = self.head

        if iterator is None :
            print("List is Empty")
            return
        
        while iterator is not None:
            if iterator.data == key:
                return iterator
            iterator = iterator.next
        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        if self.head is None:
            return
        del_node = self.head
        prev_node = None

        while del_node:
            if del_node.data == key:
                if prev_node:
                    prev_node.next = del_node.next
                else:
                    self.head == del_node.next
                return del_node
            prev_node = del_node
            del_node = del_node.next
        


