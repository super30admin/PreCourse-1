from email import header
from locale import currency

# time complexity : append, find, remove- O(n)
# space complexity: O(n) for n appends

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
        newnode = ListNode(data)
        if self.head is None: # if linkedlist is empty
            self.head = newnode
            return self.head.data
        temp = self.head
        while(temp.next): #to pass till the last node
            temp=temp.next
        temp.next = newnode # last nodes next is pointed to newnode
        return temp.next.data
        
        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        temp = self.head
        while temp:
            if temp.data == key:
                return temp.data
            temp = temp.next
        return None # key is not in linkedlist
        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        prev = None # to keep track of key's previous node
        curr = self.head
        while curr:
            if curr.data == key and prev is not None: #the key is not head
                prev.next = curr.next
                return True
            elif curr.data == key and prev is None: # the key is head
                self.head = curr.next
                return True
            prev = curr
            curr = curr.next
        return None # the key is not in linkedlist


            

L1 = SinglyLinkedList()
print(L1.append(3))
print(L1.append(2))
print(L1.find(2))
print(L1.find(5))


