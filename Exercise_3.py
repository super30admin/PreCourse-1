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
        self.head = ListNode() 


    def append(self, data):
        """
        Insert a new element at the end of the list.
        Takes O(n) time.
        """
        node = ListNode(data)
        temp = self.head
        while temp.next:
            temp = temp.next
       temp.next = node 
        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        node = self.head
        while node:
            if node.data == key:
                return key
            node = node.next

        return None
        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        node = self.head
        while node:
            if node.next and node.next == data:
                node.next = node.next.next
                return True
            node = node.next

        return False
