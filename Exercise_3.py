class ListNode:
    """
    A node in a singly-linked list.
    """
    def __init__(self, data=None, next=None):
        self.data=data
        self.next=None
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
        d=ListNode(data)
        if self.head is None:
            self.head=d
            return d
        else:
            last=self.head
            while last.next:
                last=last.next
            last.next=d
            return d


    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        d=self.head
        i=1
        if d.data==key:
            return 1
        while d.next:
            i+=1
            if d.data == key:
                return i
            d=d.next
        return None
        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        d=self.head
        if d is not None:
            if d.data==key:
                self.head=d.next
                d=None
                return
        while d is not None:
            if d.data==key:
                break
            prev=d
            d=d.next
        if d==None:
            return
        prev.next=d.next
        d=None

node=SinglyLinkedList()
print(node.append(2))
print(node.find(3))