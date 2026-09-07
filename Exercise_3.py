#Exercise_3 : Implement Singly Linked List.

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

        newNode = ListNode(data)
        if self.head is None: 
            self.head = newNode
            return
        
        current = self.head
        while current.next: 
            current = current.next
        
        current.next = newNode
        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """

        if self.head is None: 
            return 
        
        current = self.head
        while current.next : 
            if current.data == key:
                return current 
            current = current.next 
        return None
        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """

        if self.head is None: 
            return None
        
        current = self.head 
        if current.data == key: 
            current = current.next
            return
            
        while current.next : 
            if current.next.data == key:
                current.next = current.next.next
                return
            current = current.next
    

linked_list = SinglyLinkedList()

linked_list.append(10)
linked_list.append(20)
linked_list.append(30)

#TimeComplexity : O(n) for all functions 
#Space Complexity :O(n)