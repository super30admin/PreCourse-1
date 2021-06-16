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
        if self.head == None:
            self.head = None
            return
        last = self.head
        while(last.next):
            last = last.next
        last.next = newNode

        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        node = head
        while node.data != key:
            node = node.next_node()
            if node is None:
                return None
        return node
        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        head = self.head

        if (head is not None):
            if (head.data == key):
                self.head = head.next
                head = None
                return

        while (head is not None):
            if head.data == key:
                break
            prev = head
            head = head.next

        if (head == None):
            return

        prev.next = head.next

        head = None
