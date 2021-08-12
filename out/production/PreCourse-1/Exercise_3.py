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
        self.head = ListNode()

    def append(self, data):
        """
        Insert a new element at the end of the list.
        Takes O(n) time.
        """
        newNode = ListNode(data,None)
        tempHead = self.head
        while tempHead.next!= None:
            tempHead = tempHead.next
        tempHead.next = newNode

    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        tempHead = self.head
        while tempHead != None:
            if tempHead.data == key:
                return key
            tempHead = tempHead.next
        return None


    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        tempHead = self.head
        while tempHead.next != None:
            if tempHead.next.data == key:
                tempHead.next = tempHead.next.next
            tempHead = tempHead.next


