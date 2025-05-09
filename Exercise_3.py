#t.c. All operations are O(n)
#s.c. O(n)
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
        self.head = ListNode(-1)
        self.headRef = self.head

    def append(self, data):
        """
        Insert a new element at the end of the list.
        Takes O(n) time.
        """
        tempHead = self.headRef
        while tempHead.next:
            tempHead = tempHead.next
        tempHead.next = ListNode(data)

        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        tempHead = self.headRef.next
        while tempHead:
            if tempHead.data == key:
                return key
            tempHead = tempHead.next
        return None
        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        tempHead = self.headRef
        preNode =tempHead
        tempHead = tempHead.next
        while tempHead and tempHead.data != key:
            preNode = tempHead
            tempHead = tempHead.next
        if tempHead and tempHead.data == key:
            preNode.next = preNode.next.next

