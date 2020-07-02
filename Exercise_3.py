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
        self.head = ListNode(0, None)
        self.size = 0

    def append(self, data):
        """
        Insert a new element at the end of the list.
        Takes O(n) time.
        """
        pred = self.head
        for _ in range(self.size):
            pred = pred.next
        to_add = ListNode(data, None)
        to_add.next = pred.next
        pred.next = to_add
        self.size += 1
        
        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        temp = self.head
        for _ in range(self.size):
            if temp.data == key:
                return temp
            else:
                temp = temp.next
        return None
        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        temp = self.head
        pred = None
        for _ in range(self.size):
            if temp.next.data == key:
                pred = temp
                break
            else:
                temp = temp.next
        pred.next = pred.next.next
        


    
    
