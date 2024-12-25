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
            while current.next!=None:
                current = current.next
            current.next = ListNode(data)    

        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        current = self.head
        while current!=None:
            if current.data==key:
                return current.data
            current = current.next    
        return None        
        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """

        current = self.head

        if current != None and current.data == key:
            self.head = current.next
            current = None
            return
        while current!=None:
            if current.data == key:
                prev.next = current.next
                current = None
                return 
            prev = current    
            current = current.next       
        

    def printVal(self):
        current = self.head
        while current!=None:
            print(current.data)
            current = current.next        
        

s = SinglyLinkedList()
s.append(10) 
s.append(20)
s.append(30)
s.append(40)   

s.printVal() 

print('------------------------------------------')
print('Find operation')

print(s.find(100))
print(s.find(30))


s.printVal()

print('------------------------------------------')
print('Removal operation')

s.remove(10)
s.printVal()






