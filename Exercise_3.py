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
        node = ListNode(data)

        if self.head is None:
            self.head = node
        else:
            iterator = self.head
            while head.next:
                iterator = iterator.next
            iterator.next = node
        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        if self.head is None: return None

        iterator = self.head
        while head.next:
            if iterator.data == key: return iterator
            iterator = iterator.next

        return None

        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        iterator = self.head
        prev = None

        if self.head is None: return
        if self.head and self.head.data == key:
            self.head = iterator.next
            iterator = None
            return

        while iterator:
            if iterator.next == key:
                break
            prev = iterator
            iterator = iterator.next

        if iterator not None:
            prev.next = iterator.next
            iterator = None
            return


