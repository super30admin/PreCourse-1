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
        node = ListNode(data)
        if self.head:
            curr = self.head
            while curr.next:
                curr = curr.next
            curr.next = node
        else:
            self.head = node
        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        if not self.head:
            return None
        temp = self.head
        while temp:
            if temp.data == key:
                return key
        return None
        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        if self.head == None:
            return 
        temp = self.head

        #if temp is not none, and the head is to be deleted
        if temp.data == key:
            self.head = temp.next
            temp = None
            return

        while temp:
            if temp.data == key:
                break
            prev = temp
            temp = temp.next
        #if key doesn't exist in the LL
        if temp == None:
            return 
        prev.next = temp.next #bridge between prev node and next node of the node to delete

        temp = None
        