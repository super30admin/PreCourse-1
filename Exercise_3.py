#Author: Vineet Khanna
#Implementing singly linked list

from ast import And


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
        #Creating a node of type Listnode with data to append.
        node1 = ListNode(data)

        #If empty assign head to node.
        if self.head == None:
            self.head = node1
        
        #Else, traverse to end and add.
        else:
            while self.head.next:
                self.head = self.head.next
            self.head.next = node1
            
        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        #Traverse the list and if found return that else returning none.
        while self.head.next:
            if self.head.data == key:
                return key
        return None
        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        #Checking if the head element itself is the key.
        if self.head is not None and self.head.data == key:
            self.head = self.head.next
            return
        
        # Traversing linked list until finding key or end 
        # while keeping track of the previous node so that
        # its next can be assigned to next of deleted node.
        while self.head is not None:
            if self.head.data == key:
                break
            prev = self.head
            self.head = self.head.next

        if self.head == None:
            return None

        prev.next = self.head.next



# Some testing.
l1 = SinglyLinkedList()
l1.append(1)
l1.append(2)
l1.append(3)
l1.append(4)
print(l1.find(3))
l1.remove(3)
print(l1.find(3))
