# Time Complexity : Time complexity is same as given 
# Space Complexity : O(n) for appending
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : N0
class ListNode:
    """
    A node in a singly-linked list.
    """
    def __init__(self, data=None, next=None):
        self.data=data
        self.next=next
    
class SinglyLinkedList:
    def __init__(self):
        self.head=None
        """
        Create a new singly-linked list.
        Takes O(1) time.
        """

    def append(self, data):
        """
        Insert a new element at the end of the list.
        Takes O(n) time.
        """
        newNode=ListNode(data)
        if self.head:
            temp=self.head
            while(temp.next):
                temp=temp.next
            temp.next=newNode
        else:
            self.head=newNode


        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        temp=self.head
        while(temp) != None:
            if temp.data==key:
                print(temp.data)
            temp=temp.next
        print(None)
        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        
        temp = self.head
        if(temp != None):      
            if(temp.data == key):
                first_d = self.head
                self.head = self.head.next
                first_d = None     
        else:
            while(temp.next != None):
                if(temp.next.data == key):
                    first_d = temp.next
                    temp.next = temp.next.next
                    first_d = None
                    break
                temp = temp.next
            

    def print(self):
        temp=self.head
        while(temp):
            print(temp.data)
            temp=temp.next

p=SinglyLinkedList()
p.append(1)
p.append(2)
p.append(3)
p.append(4)
p.append(3)
p.print()
# p.find(3)
p.remove(3)
p.print()

