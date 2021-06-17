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
        #head points to fron end of the node and tail points to the rear end of the node
        self.head = None
        self.tail = None

    def append(self, data):
        """
        Insert a new element at the end of the list.
        Takes O(n) time.
        """
        #If there is no element in the list in the list insert at the front else insert at the rear
        if self.head ==  None:
            self.head = ListNode(data)
            return
        self.tail = self.head
        while(self.tail.next):
            self.tail = self.tail.next
        self.tail.next = ListNode(data)
        
        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        if self.head ==  None:
            return
        self.tail = self.head
        while(self.tail):
            if self.tail.data == key:
                return self.tail.data
            self.tail = self.tail.next
        return None
            
        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        if self.head ==  None:
            return
        if self.head.data ==  key:
            self.head = self.head.next
            return 
        self.tail = self.head
        while(self.tail and self.tail.next):
            if self.tail.next.data == key:
                self.tail.next  = self.tail.next.next
            self.tail = self.tail.next
    
    def show(self):
        """
        Prints all the elements of the list
        """
        if self.head ==  None:
            return
        self.tail = self.head
        while(self.tail):
            print(self.tail.data)
            self.tail = self.tail.next
        return None
            
ll = SinglyLinkedList()
ll.append(2)
ll.append(3)
ll.append(4)
ll.append(5)
print("Show element")
ll.show()
print(ll.find(5))
print(ll.find(11))
ll.remove(4)
print("Show element without 4")
ll.show()
print("Show element without 5")
ll.remove(5)
ll.show()
print("Show element without 2")
ll.remove(2)
ll.show()