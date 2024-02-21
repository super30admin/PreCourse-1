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
        current = self.head
        while current.next!= None:
            current = current.next
        current.next = ListNode(data)
              
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        current = self.head
        while current!= None:
            if current.data == key:
                return current.data
            current = current.next
        return None
        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        temp = self.head
        if temp.head != None:
            if temp.val == key:
                self.head = temp.next
                temp = None
                return
            
        while temp != None:
            if temp.val == key:
                break
            prev = temp
            temp = temp.next
        if temp == None:
            return
        prev.next = temp.next
        temp = None
