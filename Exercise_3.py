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
        if self.head == None:
          self.head = ListNode(data)
          return
        self.temp = self.head
        while self.temp.next is not None:
          self.temp = self.temp.next
        self.temp.next = ListNode(data)

    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        self.temp = self.head
        while self.temp.next is not None:
          if self.temp.data == key:
            return self.temp.data
            break
          self.temp = self.temp.next
        return None

    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        self.temp = self.head
        if self.head.data == key:
          self.head = self.head.next
          self.temp.next = None
          return
        
        while self.temp is not None:
          if self.temp.data == key:
            break
          self.prev = self.temp
          self.temp = self.temp.next

        self.prev.next = self.temp.next
        self.temp.next = None


    def printNodes(self):
      self.temp = self.head
      while self.temp is not None:
        print(self.temp.data)
        self.temp = self.temp.next

lst = SinglyLinkedList()
lst.append(1)
lst.append(2)
lst.append(3)
lst.append(4)
lst.append(5)
lst.printNodes()
print(lst.find(1))
lst.remove(3)
lst.printNodes()