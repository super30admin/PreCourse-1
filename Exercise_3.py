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
        if self.head == None:
            self.head = ListNode(data)
            self.head.next = None

        else:
            ptr = self.head
            while ptr.next:
                ptr = ptr.next
            new_element = ListNode(data)
            new_element.next = None
            ptr.next = new_element
            
        
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
                    return ptr
                ptr = ptr.next

    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        if self.head:
            if self.head.data == key:
                self.head = self.head.next
                return 
            
            first = self.head
            second = self.head.next

            while second:
                if second.data == key:
                    first.next = second.next
                    second.next = None
                    break
                first = first.next
                second = second.next

