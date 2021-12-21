
# // Time Complexity : O(n)
# // Space Complexity :O(n)
# // Did this code successfully run on Leetcode : 
# // Any problem you faced while coding this : I did not get this pro
# I had to revise singly linkedlist and concepts fo stack

class ListNode:
    """
    A node in a singly-linked list.
    """
    def __init__(self, data=None, next=None):
        self.data = data
        self.next = next
class stackEmpty(Exception):
    pass
    
class SinglyLinkedList:
    def __init__(self):
        """
        Create a new singly-linked list.
        Takes O(1) time.
        """
        self.head = None
        self.size = 0 

    def __len__(self):
        return self.size

    
    def isEmpty(self):
        return self.size == 0

    def append(self, data):
        """
        Insert a new element at the end of the list.
        Takes O(n) time.
        """

        self.head = ListNode(data, self.head)
        self.size += 1 

        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """ 
        current = self.head
 
        # loop till current not equal to None
        while current != None:
            if current.data == x:
                return True # data found
             
            current = current.next
         
        return False

        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        if self.isEmpty():
            raise stackEmpty('This stack is empty')

        temp = self.head
        if (temp is not None):
            if (temp.data == key):
                self.head = temp.next
                temp = None
                return




        while(temp is not None):
            if temp.data == key:
                break
            prev = temp
            temp = temp.next

        if(temp == None):
            return
 
        prev.next = temp.next
 
        temp = None
