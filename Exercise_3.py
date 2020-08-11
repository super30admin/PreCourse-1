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
        """
        Insert a new element at the end of the list.
        Takes O(n) time.
        """
        if self.head == None:
            self.head = ListNode(data)
        else:
            ptr = self.head
            while ptr.next != None:
                ptr = ptr.next
            ptr.next = ListNode(data)
        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """

        if self.head == None:
            return None
        else:
            ptr = self.head
            while ptr != None:
                if ptr.data == key:
                    return ptr.data
                ptr = ptr.next
            return None
        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        if self.head == None:
            return None
        else:
            ptr = self.head
            if ptr.data == key:
                self.head = ptr.next
                return
            while ptr.next != None:
                if ptr.next.data == key:
                    ptr.next = ptr.next.next
                    return
                ptr = ptr.next

    def show(self):
        ptr = self.head
        while ptr != None:
            print ptr.data
            ptr = ptr.next

sl = SinglyLinkedList()
sl.append(1)
sl.append(2)
sl.append(3)
sl.append(4)
print (sl.find(5))
sl.remove(4)
sl.show()