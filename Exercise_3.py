class ListNode:
    """
    A node in a singly-linked list.
    """
    def __init__(self, data=None,next=None):
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
        newNode = ListNode(data)
        if self.head is None:
            self.head = newNode
        else:
            n = self.head
            while n.next is not None:
                n = n.next
            n.next = newNode
        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        if self.head is None:
            return 'List is Empty'
        else:
            n = self.head
            while n is not None:
                if n.data == key:
                    return 'Element found'
                else:
                    n = n.next
        return 'Element not found'

    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        n = self.head
        if n is None:
            return 'Linked List is Empty'
        if n.data == key:
            n = n.next
            return
        while n.next is not None:
            if n.next.data == key:
                break
            n = n.next
        if n.next is None:
            return 'Element not found'
        else:
            n.next = n.next.next
                
    def traverse(self):
        if self.head is None:
            print('Linked list is empty')
        else:
            n = self.head
            while n is not None:
                print(n.data)
                n = n.next


