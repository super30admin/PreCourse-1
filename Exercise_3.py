# Exercise_3 : Implement Singly Linked List.
class ListNode:
    """
    A node in a singly-linked list.
    """
    def __init__(self, data=None, next=None):
      self.data=data
      self.next=None
    
class SinglyLinkedList:
    def __init__(self):
        """
        Create a new singly-linked list.
        Takes O(1) time.
        """
        self.head = None

    def printList(self):
        temp = self.head
        while (temp):
            print (temp.data)
            temp = temp.next
        

        

    def append(self, data):
        """
        Insert a new element at the end of the list.
        Takes O(n) time.
    
        """
        new_node=ListNode(data)
        temp=self.head
        if self.head is None:
            self.head = NewNode
            return
        while temp.next:
          temp=temp.next
        temp.next=new_node

        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        temp=self.head
        while temp is not None:
          if temp.data==key:
            return key
          temp=temp.next
        return None
        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
  
        # Store head node
        temp = self.head
 
        # If head node itself holds the key to be deleted
        if (temp is not None):
            if (temp.data == key):
                self.head = temp.next
                temp = None
                return
 
        # Search for the key to be deleted, keep track of the
        # previous node as we need to change 'prev.next'
        while(temp is not None):
            if temp.data == key:
                break
            prev = temp
            temp = temp.next
 
        # if key was not present in linked list
        if(temp == None):
            return
 
        # Unlink the node from linked list
        prev.next = temp.next
 
        temp = None
 
 
        
          
        
          
if __name__=='__main__':
  llist = SinglyLinkedList()
  llist.head=ListNode(1)
  second = ListNode(2)
  third = ListNode(3)
  llist.head.next = second
  second.next=third
  third.next=None
  print("Initial Linked List:")
  llist.printList()
  
  llist.append(4)
  llist.append(4)
  llist.append(5)
  llist.append(6)
  llist.append(7)
  print("after Appending items:")
  llist.printList()
  print("item is",llist.find(2))
  llist.remove(4)
  print("Final linked list:")
  llist.printList()