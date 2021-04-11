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

    def append(self, data): # Time complexity :O(n)
        if self.head == None:
           self.head.data = data
        return
        curr = head
        while curr.next is not None:
            curr = curr.next
        temp = ListNode(data)
        curr.next = temp
    
    def find(self, key):
        if head == None:
            return None
        curr = head
        while curr is not None:
            if curr.data == key:
                return curr
        return None
        
    def remove(self, key):  #Time complexity :O(n)
        if head == None:
            return None

        prev = None
        curr = head

        while curr is not None:
            if curr.data == key:
                break
            else:
                prev = curr
                curr = curr.next
        if curr is None:
            return None
        else:
            if prev is None:
                temp = self.head
                self.head = self.head.next
                del temp
                return
            prev.next = curr.next
            curr.next = None
            del(curr)
        
        