#Time Complexity - O(N), Space Complexity - O(N)

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
        new_node = ListNode(data)
        if self.head is None:
          self.head = new_node
          return
        current_node = self.head
        while current_node.next != None:
          current_node = current_node.next
        current_node.next = new_node
        
        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        current_node = self.head
        while current_node != None:
          if current_node.data == key:
            return current_node
          current_node = current_node.next
        return None

        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        current_node = self.head
        if current_node.data == key:
          self.head = current_node.next
          current_node.next = None
          return

        while current_node is not None:
          if current_node.data != key:
            prev = current_node
            current_node = current_node.next
          else:
            prev.next = current_node.next
            current_node.next = None
            break
    def printLinkedList(self):
        temp = self.head
        while(temp):
            print (temp.data)
            temp = temp.next
            


S = SinglyLinkedList()
S.append(4)
S.append(6)
S.append(9)
S.find(6)
S.printLinkedList()
S.remove(6)
S.printLinkedList()
S.remove(4)
S.printLinkedList()
