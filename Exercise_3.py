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
        temp = self.head
        while temp.next:
            temp = temp.next
        
        temp.next = ListNode(data=data)
        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        temp = self.head
        while temp:
            if temp.data == key:
                break
            temp = temp.next
        
        return temp
        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        temp = self.head
        prev = None
        while temp:
            if temp.data == key:
                # node found
                if prev == None:
                    # head node
                    self.head = self.head.next
                    temp.next = None
                else:
                    prev = temp.next.next
                    temp.next = None
                break
            prev = temp
            temp = temp.next
