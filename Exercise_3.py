#Time Complexity : O(1)
#Space Complexity : O(n)
#Did this code successfully run on Leetcode : No, I did not run it on leetcode
#Any problem you faced while coding this : No


#Your code here along with comments explaining your approach
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
        #store the data node in new new_node
        new_node = ListNode(data)
        # if head is none we add the new_node to head
        if self.data is None:
            self.data = new_node
            return
        
        #else we traverse the linked list and add at the end
        new_head = self.data
        while(new_head.next):
            new_head = new_head.next
        new_head.next= new_node
            
        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        #we traverse through the linkedlist and return true if some node of linked list is equal to the given node
        new_head = self.head 
        while new_head != None: 
            if new_head.data == key: 
                return True    
            new_head = new_head.next
          
        return False
        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        #traverse through the linked list to find the node
        #we store the prev node because once the node gets deleted the prev.next should point to node.next
        new_head = self.head  
        while new_head != None:
            if (new_head.data == key):  
                self.head = new_head.next
                new_head = None
                return
            if new_head.data == key:  
                break
            prev = new_head  
            new_head = new_head.next
        prev.next = new_head.next
        new_head = None
  
        #we reached the end of the linkedlist and do not found the node so return false
        
        if(new_head == None):  
            return False
  
        
