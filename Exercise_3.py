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
        node = ListNode(data, None)
        if self.head:
            temp = self.head
            while temp.next:
                temp = temp.next
            temp.next = node
        else:
            self.head = node
        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        if self.head:
            temp = self.head
            while temp:
                if temp.data == key:
                    return temp.data
                temp = temp.next
            return None
        else:
            return "Linked List is Empty"
        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        flag = False
        if self.head:
            temp = self.head
            if temp.data == key:
                self.head = temp.next
                return "Removed"

            while temp:
                if temp.data == key:
                    prev.next = temp.next
                    temp = None
                    return "Removed"
                else:
                    prev = temp
                temp = temp.next
            return "Key not Found"
        return "Linked List is Empty"

