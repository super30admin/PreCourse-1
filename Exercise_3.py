# time complexity of singly linked list = O(n)
# space complexity of singly linked list = O(n)


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
        new_node = Node(data)
        if self.head is None:
            self.head = new_node
        else:
            x = self.head
            while x.next != None:
                x = x.next
            x.next = new_node    
        """
        Insert a new element at the end of the list.
        Takes O(n) time.
        """
        
    def find(self, key):
         if self.head == None:
            return None
        else:
           current = self.head
           if current.data == key:
                return current.data
           else:
                current = current.next
        return None   
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        
    def remove(self, key):
        if self.head == None:
            return None
        else:
            current = self.head
            current.key = current.next.key
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
