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

        if self.head is None:
            self.head = ListNode(data)

        else:
            temp = self.head
            while temp.next is not None:
                temp = temp.next
            temp.next = ListNode(data)
        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        temp = self.head

        while temp.data != key and temp.next is not None:
            temp = temp.next
        if temp.data == key:
            return temp       # Returning the node where node.data = key
        else:
            return None

    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        # Case when there is only single element in the list
        if self.head is not None and self.head.data == key:
            self.head = self.head.next
        if self.head is None:
            return None

        temp = self.head
        prev = temp
        while temp.data != key and temp.next is not None:
            prev = temp
            temp = temp.next

        if temp.data == key:
            prev.next = temp.next