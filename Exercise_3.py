#overall complexity would be O(n) time and space both
class ListNode:
    """
    A node in a singly-linked list.
    """
    # added this self.data and self.next as it was giving some indentation error
    # also I have used LL like this before so added this
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
        if(self.head == None):
            self.head = new_node
            return
        else:
            t = self.head
            while(t.next != None):
                t = t.next
            t.next = new_node
        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        curr = self.head
        while curr != None:
            if curr.data == key:
                return key
            curr = curr.next
        return None

        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        t = self.head
        if (t is not None):
            if(t.data == key):
                self.head = t.next
                t = None
                return
        
        while(t is not None):
            if t.data == key:
                break
            prev = t
            t = t.next
        if (t == None):
            return
        prev.next = t.next
        t = None
        
