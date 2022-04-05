# Exercise_3 : Implement Singly Linked List.
# // Time Complexity :
  # push : 
  # pop : output 
  # peek
  # size
  # show 
# // Space Complexity : O(n)
# // Did this code successfully run on Leetcode : No leetcode handle given 
# // Any problem you faced while coding this : 
# // Your code here along with comments explaining your approach



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

    def getCurr(self):
        if self.head == None:
            return None
        else: 
            prev = None 
            curr = self.head 

        while curr.next!=None:
            prev = curr 
            curr = curr.next
            
        return curr, prev 

    def append(self, data):
        """
        Insert a new element at the end of the list.
        Takes O(n) time.
        """
        newnode = ListNode(data)
        if self.head ==None:
            self.head = newnode
            return 
        curr, _ = self.getCurr()
        curr.next = newnode
        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        if self.head == None:
            print("Empty Stack")
            return None
        else: 
            prev = None 
            curr = self.head 

        while curr.data!=key:
            prev = curr 
            curr = curr.next
            if curr == None:
                print("Nothing to find")
                return None    
            
        if curr.data==key:
            return curr
        print("Not found")
        return None 


    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        if self.head == None:
            print("Empty Stack")
            return None
        else: 
            prev = None 
            curr = self.head 

        while curr.data!=key:
            prev = curr 
            curr = curr.next
            if curr == None:
                print("Nothing to remove")
                return None                 
            
        if curr.data==key:
            return_node = curr ; print(return_node.data)
            if prev!=None:
                prev.next = curr.next 
                return return_node 
            else:
                # print(curr == self.head)
                self.head = None 
        print("Nothing to remove")
        return None 



myL = SinglyLinkedList()
myL.append(10) ; myL.append(20) ; myL.append(30) ; myL.append(40)
myL.find(50)
myL.remove(50)
myL.remove(40)
myL.remove(30)
myL.remove(20)
myL.remove(10)
myL.remove(10)
myL.append(10) ; myL.append(20) ; myL.append(30) ; myL.append(40)