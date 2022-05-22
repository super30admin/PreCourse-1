#Space complexity is O(n)
#Time complexity O(1) all operations except print
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
        if (self.head == None):
          self.head = ListNode(data, None)
          return

        temp = self.head
        while temp.next:
          temp = temp.next
        
        temp.next = ListNode(data, None)


    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        temp = self.head
        while temp != None:
          if temp.data == key:
              return temp.data
          temp = temp.next
          
        return temp.data
        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        temp = self.head
        #remove first node
        if temp.data==key:
            self.head = temp.next
            temp.next = None
            return
        else:
          previuos_temp =temp
          #remove middle node
          while temp.next != None:
            if temp.data == key:
              previuos_temp.next = temp.next
              return
            previuos_temp = temp
            temp = temp.next
          #remove last node
          if temp.next == None and temp.data == key:
            previuos_temp.next = None
#just for checking the implementation of remove function
    def print(self):
        temp = self.head
        while temp.next != None:
            print(temp.data, end=" ")
            temp = temp.next
        print(temp.data)

s= SinglyLinkedList()
s.append("banana")
s.append("mango")
s.append("apple")
s.find("banana")
s.remove("mango")
s.print()
