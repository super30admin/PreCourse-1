class ListNode:
    """
    A node in a singly-linked list.
    """
    def __init__(self, data=None, next=None):
        self.data = data
        self.next = None
    
class SinglyLinkedList:
    def __init__(self):
        self.head = None

    def append(self, data):
        """
        Insert a new element at the end of the list.
        Takes O(n) time.
        """
        new_node = ListNode(data)
        if(self.head == None):
            self.head = new_node
            self.head.next = None
        else:
            temp = self.head
            while(temp.next!=None):
                temp = temp.next
            temp.next = new_node
            temp.next.next = None
        return True
        
            
        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        temp = self.head
        while(temp!=None):
            print(temp.data)
            if(temp.data == key):
                return temp
            temp = temp.next
        return None
        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        if(self.head == None):
            return None
        elif(self.head.next == None):
            self.head = None
        else:
            if(self.head.next.data == key):
                self.head = self.head.next
            temp = self.head
            while(temp.next!=None):
                if(temp.next.data == key):
                    print(temp.next.data)
                    temp.next = temp.next.next
                    return True
                temp = temp.next

s =  SinglyLinkedList()
s.append(5)
s.append(6)
print(s.find(6))
s.remove(6)

        
        
            

