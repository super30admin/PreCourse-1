  # O(n) time complexity 
  # O(n) space comlexity
class ListNode:
    """
    A node in a singly-linked list.
    """
    def __init__(self, data=None, next=None):
        self.data=data
        self.next=next
    
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
        new_node=ListNode(data)
        if not self.head:
            self.head=new_node
            return
        last=self.head
        while last.ext:
            last=last.next
        last.next=new_node
        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        current= self.head
        while current and current.data!=key:
            current=current.next
        return current
        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        current =self.head
        prev=None
        while current and  current.data!=key:
            prev=current
            current=current.next
        if current is None:
            return None
        if prev is None:
            self.head=current.next
        else:
            prev.next=current.next
        return current
