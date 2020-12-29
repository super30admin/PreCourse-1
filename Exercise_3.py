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
        NewNode = ListNode(data)
        if self.head == None:
            self.head = NewNode
            return
        temp = self.head
        while(temp.next):
            temp = temp.next
        temp.next = NewNode
        
        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        temp = self.head
        while(temp.next):
            print(temp.data)
            if temp.data == key:
                return temp.data
            temp = temp.next
        else:
            print(temp.data)
            if temp.data == key:
                return temp.data
        return 'None'
            
            
        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        temp = self.head
        if temp.data == key:
            self.head = self.head.next
            return
                
        while temp.next:
            if temp.data == key:
                break
            q = temp
            temp = temp.next
        if not temp:
            return
        q.next = temp.next
        #temp =None
        
    def show(self):
        p = self.head
        while p.next:
            print(p.data)
            p = p.next
        print(p.data)
        
        
        
L = SinglyLinkedList()
L.append('Monday')
L.append('Tuesday')
L.append('Friday')
L.append('Saturday')
L.show()
print('REmoved')
L.remove('Friday')

L.show()