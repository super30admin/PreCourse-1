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
        newEntry = ListNode(data, None)

        if self.head == None:
            self.head = newEntry

        else:
            counter = self.head
            while counter.next is not None:
                counter.next
            
            counter.next = newEntry
            

    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        if self.head == None:
            return "Linked List is Empty"
        else:
            finder = self.head
            while finder.next is not None:
                if finder.data == key:
                    return True
                finder = finder.next
        
        return "Not found"
        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        if self.head == None:
            return "Linked List is Empty"
        else:
            finder = self.head
            while finder.next.next is not None:
                if finder.next.data == key:
                    finder.next = finder.next.next

