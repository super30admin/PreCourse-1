from email import header
from http.client import NETWORK_AUTHENTICATION_REQUIRED


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
        new_node = ListNode(data)
        temp = self.head
        if self.head == None:
            self.head = new_node
        else:
            while(temp.next != None):
                temp = temp.next
            temp.next = new_node
            new_node.next = None



        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        temp = self.head
        while(temp.next != None):
            if (temp.data == key):
                print(temp)
                break
            else:
                temp = temp.next
        return None
        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        temp = self.head
        if(self.head.data == key):
            self.head = self.head.next
        while(temp.next != None):
            if(temp.next.data == key):
                temp.next = temp.next.next
                break
        
        

LL = SinglyLinkedList()
LL.append(1)
LL.append(2)
LL.append(3)
LL.find(2)
LL.remove(2)



