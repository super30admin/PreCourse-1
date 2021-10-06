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
        
        if not self.head:
            self.head = new_node
        else:
            ptr = self.head

            while ptr.next:
                ptr = ptr.next

            ptr.next = new_node
        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        if self.head:
            ptr = self.head

            while ptr:
                if ptr.data == key:
                    return ptr.data
                ptr = ptr.next
            return None
        else:
            return None
        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        if self.head:
            ptr = self.head

            while ptr:
                if ptr.next.data == key:
                    ptr.next = ptr.next.next
                    return
                ptr = ptr.next
            print("Key not found")
            return
        else:
            print("Key not found")
            return

