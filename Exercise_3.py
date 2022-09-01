# Any problem you faced while coding this : No

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
        
        Head points to the first node in the list
        Tail points to the last node in the list
        """
        self.head = None
        self.tail = None

    def append(self, data):
        """
        Insert a new element at the end of the list.
        Takes O(n) time and space.

        If head is none - no node exists - assign head and tail as the newly interested element
        Tail points to the last node in the list
        """
        node = ListNode(data)
        if self.head is None:
            self.head = self.tail = node
        else:
            self.tail.next = node
            self.tail = self.tail.next
        return self.tail
        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.

        Iterate the full list - if thee data of any of the node matches the key, return True
        """
        curr = self.head
        while curr:
            if curr.data == key:
                return True
            else:
                curr = curr.next
        return False
        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.

        Iterate the full list - check if the data of the data matches the key - if yes delete the node.
        Previous node is maintained using prev pointer
        """
        prev = None
        curr = self.head
        while curr:
            if curr.data == key:
                if prev:
                    prev.next = curr.next
                else:
                    self.head = curr.next
            return True
            prev = curr
            curr = curr.next

        return False

