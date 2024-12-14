# Time Complexity := O(n)
# Space Complexity := O(n)

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
        new_Node = ListNode(data)
        if self.head is None:
            self.head = new_Node
        else:
            curr = self.head
            while curr.next:
                curr = curr.next
            curr.next =  new_Node
    def remove(self,data):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        curr = self. head
        prev  = None
        while curr:
            if curr.data == key:
                if prev is None:
                    self.head = curr.next
                else:
                    prev.next = curr.next
                return True 
            prev = curr
            curr = curr.next
        return False
  