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
        node=ListNode(data)
        if self.head==None:
            self.head=node
        else:
            current=self.head
            while current.next:
                current=current.next
            current.next=node
        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        if self.head==None:
            return "Oops! No node in the link list"
        else:
            node=self.head
            while node is not None:
                if node.data==key:
                    return True
                node=node.next
            return None
        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        if self.head is None:
            return "Oops! the linked list is Empty"
        if self.head.data==key:
            self.head=self.head.next
        else:
            current=self.head
            prev=None
            while current.next:
                if current.data==key:
                    prev.next=current.next
                    current.next=None
                else:
                    prev=current
                    current=current.next
            return False

    