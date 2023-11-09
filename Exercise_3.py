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
        d = ListNode(data)
        if not self.head:
            self.head = d
        else:
            p = self.head
            while p.next:
                p = p.next
            p.next = d

    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        if not self.head:
            return None
        p = self.head
        while p.next:
            if p.data == key:
                return p.data
            p = p.next
        
    def __str__(self):
        p = self.head
        l = []
        while True:
            l.append(p.data)
            p = p.next
            if not p:
                break
        return ''.join(str(l))

    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        if self.head.data == key:
            self.head = None
            return key
        prev = None
        curr = self.head
        while curr.next:
            if curr.data == key:
                prev.next = curr.next
                return key
            prev = curr
            curr = curr.next
        return -1

s = SinglyLinkedList()
s.append(11)
s.append(14)
s.append(13)
s.append(12)
s.append(16)
print(s.find(13))
print(s)
print(s.remove(13))
print(s)