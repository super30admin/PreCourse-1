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
        if(self.head):
            current = self.head
            while current.next:
                current=current.next
            current.next = ListNode(data)
        else:
            self.head = ListNode(data)

    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        if  not self.head:
            return None
        else:
            current = self.head
            while current:
                if current.data == key:
                    return current
                current = current.next
            return None

    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        if not self.head:
            return
        else:
            if(self.head.data == key):
                self.head = self.head.next
            else:
                current = self.head.next
                temp = self.head
                while current:
                    if current.data == key:
                        temp = current.next
                    else:
                        current = current.next
                        temp = temp.next
