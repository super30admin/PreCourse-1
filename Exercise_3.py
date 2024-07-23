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
            current = self.head
            while current.next is not None:
                current = current.next
            current.next = new_node
            

        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        current = self.head
        while current is not None:
            if current.data == key:
                return current
            current = current.next
        return ("Key not in Linked List")    
        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        current = self.head
        previous = None
        found = False
        while current is not None and not found:
            if current.data == key and current is self.head:
                self.head = current.next
                found = True
                break
            elif current.data == key:
                previous.next = current.next
                found = True
                break
            else:
                previous = current
                current = current.next
        if not found:
            return ("Key not in Linked List")
