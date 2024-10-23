#TC: O(n) for all operations
#SC: O(n) where n is the number of elements in the list
class ListNode:
    """
    A node in a singly-linked list.
    """
    def __init__(self, data=None, next=None):
        self.data = data  
        self.next = next 
class SinglyLinkedList:
    def __init__(self):
        self.head = None

    def append(self, data):
        new_node = ListNode(data)
        if self.head is None:
            self.head = new_node  
        else:
            current = self.head
            while current.next:
                current = current.next
            current.next = new_node
        
    def find(self, key):
        current = self.head
        while current:
            if current.data == key:
                return current  
            current = current.next
        return None  

        
    def remove(self, key):
        current = self.head
        previous = None
        while current:
            if current.data == key:
                if previous:
                    previous.next = current.next  
                else:
                    self.head = current.next 
                return True  
            previous = current
            current = current.next
        return False