class ListNode:
    """
    A node in a singly-linked list.
    """
    def __init__(self, data=None, next=None):
        self.data = data
        self.next= next
    
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
        node = ListNode(data)
        if self.head == None:
            self.head = node
            self.tail = node
        else:
            self.tail.next = node
            self.tail = node
        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        temp = self.head
        if temp != None:
            while temp.next != None:
                if (temp.data == key):
                    return temp
                temp = temp.next
            if (temp.data == key):
                return temp
        return None

    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        temp = self.head
        if temp.data == key:
            temp = self.head = temp.next
        while ( temp.next != None):
             print(temp.data)
             if temp.next.data == key:
                node = temp.next
                temp.next  = temp.next.next
                del node
             else:
                temp = temp.next