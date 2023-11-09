"""
Exercise_3 : Implement Singly Linked List.
Time Complexity : O(1)
Space Complexity : O(N)

 Add/Remove item to the front of the list: O(1)   
 Add/Remove item to the end of the list or anywhere in the list: O(n)

@name: rahul
"""

class ListNode:
    """
    A node in a singly-linked list.
    """
    def __init__(self, data, next=None):
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
        
        newNode = ListNode(data)
        
        if self.head is None:
            self.head = newNode
            return
            
        else:
            lastNode= self.head
            
            while (lastNode.next):
                lastNode = lastNode.next
            
            lastNode.next=newNode
            return
            
        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        temp = self.head
        
        while(temp is not None):
            
            if temp.data == key:
                
                return key
            
            
            prev =temp
            temp = temp.next
            
        return None
        
        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        
        temp = self.head
        
        if (temp is not None):
            if(temp.data == key):
                self.head = temp.next
                temp=None
                return
            
        while(temp is not None):
            
            if temp.data == key:
                break
            
            prev =temp
            temp = temp.next
            
        if (temp == None):
            print(key," is not present in the list")
            return
        
        prev.next = temp.next
        temp = None
        
        return "Key Removed"


llist = SinglyLinkedList()

llist.append(5)
llist.append(7)
llist.append(3)
llist.append(2)

print(llist.find(3))
print(llist.remove(3))
print(llist.find(3))