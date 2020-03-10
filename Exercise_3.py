Time complexity: O(1) for creation and O(n) for list, append, find and remove.
Space complexity: O(n)
Challenges: Couple of errors in find() due to missing boundary condition, which was later ectified. Added ListItems() to check results.

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
    
    def listItems(self):
        current_item = self.head
        while current_item:
          print(current_item.data)
          current_item = current_item.next

    def append(self, data):
        """
        Insert a new element at the end of the list.
        Takes O(n) time.
        """
        newNode = ListNode(data, None)
        if self.head is None:
          self.head = newNode
        else:
          current_node = self.head
          while current_node.next:   # Until we reach the final node pointing to null value
            current_node = current_node.next
          current_node.next = newNode   # Append new node to the last node
        print ("Item appended:", data, "\nLinked List:")
        self.listItems()
        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        if self.head is None:
          return None
      
        current_node = self.head

        while current_node:
          if current_node.data == key:
            print("Items found:")
            return str(current_node.data) + " is found"
          else:
            current_node = current_node.next
            # Boundary condition
            if current_node.next == None and current_node.data != key:
              return None

    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """

        previous = self.head
        
        if self.head is None:
            return None
        
        if self.head.data == key:
            self.head = previous.next
            return str(key) + " was removed successfully"
        
        else:
            while previous:
                if previous.next.data == key:
                    previous.next = previous.next.next
                    return str(key) + " was removed successfully"
                else:
                  previous = previous.next
        

s= SinglyLinkedList()
s.append(2)
s.append(10)
s.append(22)
s.append(29)
print (s.find(99))
print (s.find(29))
print (s.remove(10),"\nList all items:")
s.listItems()
