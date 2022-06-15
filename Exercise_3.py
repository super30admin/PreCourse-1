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
        temp = ListNode(data)

        if self.head is None:
          self.head = temp
        else :
          curr = self.head
          while(curr.next is not None):
            curr = curr.next
          curr.next = temp
    
    def prin(self):
      '''
      Print's the elements in the Linked List (for test)
      '''
      curr = self.head
      while(curr is not None):
        print(curr.data)
        curr = curr.next
          
        
    def find(self, key):
      """
      Search for the first element with `data` matching
      `key`. Return the element or `None` if not found.
      Takes O(n) time.
      """
      curr = self.head
      while(curr):
        if(curr.data == key):
          return key
          break
        curr = curr.next
      return None

  
    def remove(self,key):
      """
      Remove the first occurrence of `key` in the list.
      Takes O(n) time.
      """
      curr = self.head
      if(curr.data is key):
        self.head = self.head.next
      else :
        while(curr.next is not None):
          if(curr.next.data is key):
            curr.next = curr.next.next
          if (curr.next is not None):
            curr = curr.next

        

ll1 = SinglyLinkedList()
ll1.append(10)
ll1.append(20)
ll1.append(30)
ll1.append(40)
ll1.append(50)
print(ll1.find(10))
ll1.remove(50)
ll1.prin()
