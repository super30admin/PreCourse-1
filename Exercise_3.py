from Exercise_2 import Node


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
        Takes O(1) space.
        """
        self.head = None

    def append(self, data):
        """
        Insert a new element at the end of the list.
        Takes O(n) time.
        Takes O(1) space.
        """
        if self.head is None:
            self.head = ListNode(data)
        else:
            itr = self.head
            while itr.next:
                itr = itr.next
            itr.next = ListNode(data)
        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        Takes O(1) space.
        """
        if self.head is None:
            return None
        else:
            itr = self.head
            while itr:
                if itr.data == key:
                    return itr.data
            else:
                return None
        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        Takes O(1) space.
        """
        if self.head is None:
            return None
        else:
            itr = self.head
            prev = None
            while itr and itr.val != key:
                prev = itr
                itr = itr.next
            if itr== None:
                print("not found")
            else:
                prev.next = itr.next
        
    

