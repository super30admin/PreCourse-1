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
        node = ListNode(data)
        temp = self.head
        if not temp:
            self.head = node
            return
        while temp.next:
            temp=temp.next
        temp.next = node

        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        temp = self.head
        while(temp):
            if temp.data == key:
                return temp
            temp= temp.next
        return None
        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """

        temp = self.head
        if not temp:
            return
        elif temp.data == key:
            self.head = self.head.next
            return

        while(temp):
            if temp.data == key:
                prev.next = temp.next
                return
            prev = temp
            temp = temp.next
