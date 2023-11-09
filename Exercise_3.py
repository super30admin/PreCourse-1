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
        new_Node = ListNode(data)
        if self.head is None:
            self.head = new_Node
        else:
            curr = self.head
            while curr.next is not None:
                curr = curr.next
                curr.next = new_node

        """
        Insert a new element at the end of the list.
        Takes O(n) time.
        """
        
    def find(self, key):
        if self.head is None:
            return None
        else:
            curr = self.head
            while curr.next is not None:
                if curr.data == key:
                    return curr.data
                else:
                    curr = curr.next

        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        
    def remove(self, key):
        if self.head is None:
            return None

        if self.head.data == key:
            self.head = self.head.next

        else:
            curr = self.head
            while curr.next is not None:
                if curr.data == key:
                    break
        prev = curr
        curr = curr.next
        prev.next = curr.next
        return self.head
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
