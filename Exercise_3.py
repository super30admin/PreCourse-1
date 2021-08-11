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
        self.head = ListNode()
        self.last = self.head
       # print(self.head.data)
       
        

    def append(self, data):
        """
        Insert a new element at the end of the list.
        Takes O(n) time.
        """
        #print("in append, data ",data)
        #if the list is empty
        if self.head.data == None:
            self.head.data = data
            return
        
        new_node = ListNode(data)
        n = self.head
        while (n.next != None):
            n = n.next
        n.next = new_node
        self.last = new_node
        
        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        if (self.head.data == None):
            return "Not Found"
        n = self.head
        while (n!= None):
            if(n.data == key):
                print(n.data)
                return "key found"
            n = n.next 
        #print()
        return "Not Found"
            
        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        
        if (self.head.data == key):
            self.head = self.head.next
       #     print(self.head.data,self.head.next)
            return
        
        n = self.head
        print(n.next.data, key)
        while (n.next.data != key):
            print("!!!  ",n.data,n.next.data)
            n = n.next
        n.next = n.next.next
        
        
    def displayList(self):
        n = self.head
      #  print(self.head.data,self.head.next)
        while (n != None):
            print(n.data," ")
            n = n.next

sll = SinglyLinkedList()
sll.append(2)
#sll.displayList()
sll.append(3)
sll.append(4)
sll.displayList()
print("remove 2 ")
sll.remove(2)
print("display")
sll.displayList()
print("add 5")
sll.append(5)
sll.displayList()
print("remove 4 ")
sll.remove(4)
print("display")
sll.displayList()
print("finding 5: ",sll.find(5))
print("finding 6: ",sll.find(6))