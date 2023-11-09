# Time Complexity : O(n)
# Space Complexity : O(n) 
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

class ListNode:
    """
    A node in a singly-linked list.
    """
    def __init__(self, data=None, next=None):
        self.data = data  # Assign data
        self.next = None  # Initialize next as null
  
    
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
        else:
            current = self.head
            while(current.next):
                current = current.next
            current.next = new_node
        

    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        current = self.head
        while current is not None:
            if current.data == key:
                print(key)
                return
            else:
                current = current.next
        return print("key not found")


    def remove(self, key):
        
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        head = self.head
         
        if (head is not None):
            if (head.data == key):
                self.head = head.next
                head = None
                return
        while (head is not None):
            if (head.data == key):
                break
            prev = head
            head = head.next

        if (head == None):
            return

        prev.next = head.next
        head = None
        
ssl=SinglyLinkedList()
ssl.append(20)
ssl.append(10)
ssl.append(5)
ssl.find(10)
ssl.remove(10)
ssl.append(30)
ssl.find(10)
