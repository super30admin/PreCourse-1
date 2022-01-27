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
            current = self.head
            while current.next is not None:
                current = current.next
            current.next = ListNode(data)
            
        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        if self.head == None:
            return ("Linkedlist is empty")
        else:
            current = self.head
            while current is not None:
                if current.data == key:
                    return current.data
                current = current.next
            return None
        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        current = self.head
        if current == None:
            return ("Linkedlist is empty")
        if current.data == key:
            current = current.next
            current = None
            return
        while current.next is not None:
            if current.next.data == key:
                break
            current = current.next
            if current.next is None:
                return ("Key doesn't exist")
            else:
                current.next = current.next.next
                
    def printLL(self):
        current = self.head
        while(current):
            print(current.data)
            current = current.next

list1 = SinglyLinkedList() 
list1.append(5) 
list1.printLL()
list1.append(10)
list1.printLL()
list1.find(5)
list1.printLL()
list1.remove(5)
list1.remove(10)
list1.printLL()