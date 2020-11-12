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
        if self.head == None:
            self.head = ListNode(data)
        else:
            node = ListNode(data)
            current = self.head
            while(current.next != None):
                current = current.next
            current.next = node
        """
        Insert a new element at the end of the list.
        Takes O(n) time.
        """
        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        if self.head == None:
            return None
        elif self.head.data == key:
            return self.head
        else:
            current = self.head
            while(current == None):
                if current.data == key:
                    return current
                else:
                    current = current.next
            return None

        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        if self.head == None:
            return None
        else:
            prev = ListNode()
            prev.next = self.head
            while (prev.next.data == key):
                prev = prev.next
            temp = prev.next
            prev.next = temp.next
            if (temp == self.head):
                self.head = prev


