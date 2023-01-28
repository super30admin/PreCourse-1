class ListNode:
    """
    A node in a singly-linked list.
    
    """
    data = None
    next = None
    def __init__(self, data=None, next=None):
        self.data = data
        self.next = next
class SinglyLinkedList:
    head = None
    def __init__(self):
        """
        Create a new singly-linked list.
        Takes O(1) time.
        """
        self.head = ListNode()

    def append(self, data):
        """
        Insert a new element at the end of the list.
        Takes O(n) time.
        """
        self.head = ListNode(data=data, next=self.head)
        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        i = self.head
        while i != None:
            if i.data == key:
                i = i.next
                return key
            else:
                i = i.next
                
        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        i = self.head
        j = ListNode()
        while i != None:
            if i.data == key:
                i = i.next
            else:
                j.data = i.data
                j.next = i.next
                i = i.next 

        self.head = j
        
# n = SinglyLinkedList()
# n.append(10)
# n.append(20)
# i = n.head
# while i != None:
#     print(i.data)
#     i = i.next