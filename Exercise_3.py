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
        if self.head is None:
            self.head=ListNode(data,None)
            return

        ptr=self.head
        while ptr.next is not None:
            ptr=ptr.next

        ptr.next=ListNode(data,None)
        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        if self.head is None:
            return

        ptr=self.head

        while ptr is not None:
            if ptr.data==key:
                return ptr
            ptr=ptr.next

        return None
        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        if self.head is None:
            return

        ptr=self.head

        while ptr.next is not None:
            if ptr.next.data==key:
                print(ptr.next.data)
                ptr.next=ptr.next.next
                
            ptr=ptr.next

l=SinglyLinkedList()
l.append(10)
l.append(20)
l.append(30)
print(l.find(20))
print(l.remove(20))