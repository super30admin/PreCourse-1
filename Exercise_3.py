# Time complexity: O(n)
# Space complexity: O(1)

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
            return
        else:
            temp=self.head
            while temp.next:
                temp=temp.next
            temp.next=ListNode(data)
            return
        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        temp=self.head
        while temp:
            if temp.data==key:
                return temp
            temp=temp.next
        return None
        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        temp=self.head
        
        # If the head node itself holds the key to be deleted
        if temp is not None:
            if temp.data==key:
                self.head=temp.next
                temp=None
                return
            
        # Search for the key to be deleted, keep track of the previous node as we need to change 'prev.next'
        while temp is not None:
            if temp.data==key:
                break
            prev=temp
            temp=temp.next

        # Key not present in the list
        if temp is None:
            return
        
        prev.next=temp.next
        temp=None
        return