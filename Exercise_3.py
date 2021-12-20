# Time complexity:
    # append - O(n)
    # find - O(n)
    # remove - O(n)
 # Space Complexity: O(n)
 
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
        newVal = ListNode(data)
        if not self.head:
            self.head = newVal
        else:
            temp = self.head
            while temp.next:
                temp  = temp.next
            temp.next = newVal

    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        if self.head == None:
            return None

        curr = self.head
        while curr:
            if curr.data == key:
                return curr.data
        return None

    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        if self.head == None:
            return None
        prev = None
        curr = self.head
        
        while curr:
            if curr.data == key:
                if prev == None:
                    self.head = curr.next
                else:
                    prev.next = curr.next
                return
            prev = curr
            curr = curr.next
        return None