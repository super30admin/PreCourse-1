'''Time Complexity : O(n) ; n = number of elements in the LinkedList
        To insert, remove or find key, we need to traverse entire linklist
Space Complexity : O(n); 
Did this code successfully run on Leetcode : - 
Any problem you faced while coding this : No

Your code here along with comments explaining your approach
'''

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
        newnode = ListNode(data)
        if not self.head:     #if Linklist is empty, make new node as first/head node
            self.head=newnode
        else:                #if linkList has nodes present, append newnode at end of list
            temp = self.head
            while temp.next:
                temp = temp.next
            temp.next = newnode
       
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        temp = self.head
        while temp.data != key:
            temp = temp.next
        print("Key Found :",temp.data)
        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """       
        if self.head.data == key:  # if key is at start node
            x = self.head.data
            self.head = self.head.next
        else:
            temp = self.head
            while temp.data != key:
                prev = temp
                temp = temp.next
            x = temp.data
            if temp.next is None:   #if key is at last node 
                prev.next = None
            else:                   #if key is at middle node
                prev.next = temp.next
        print("Remove key:",x)    


    def show(self):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        l = []
        temp = self.head
        while temp:
            l.append(temp.data)
            temp = temp.next
        print("Linked List : ", l)


s = SinglyLinkedList()
s.append(1)
s.append(2)
s.append(3)
s.show()
s.find(2)
s.remove(1) #remove 1st node
s.show()
s.append(4)
s.append(5)
s.show()
s.remove(5) #ewmove last node
s.show()
s.remove(3) #remove middle node
s.show()