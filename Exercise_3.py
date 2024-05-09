# Did this code successfully run on Leetcode : Ran on VS code 
# Any problem you faced while coding this :
# Space complexity: O(n)
   
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
    
    # time complexity: O(n)  
    def append(self, data):
        """
        Insert a new element at the end of the list.
        Takes O(n) time.
        """
        node = ListNode(data)
        if self.head == None:
            self.head = node
            return
        
        current = self.head
        while current.next:
            current = current.next
        current.next = node    

    # time complexity: O(n)     
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        current = self.head
        pos = 0

        while current:
            if current.data == key:
               return f" Key {key} found at Pos {pos}"
            current = current.next
            pos += 1
        return f"Key {key} not found "
    
    # time complexity: O(n)  
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """

        if self.head == None:
            return
        
        current = self.head
        if current.data == key:
            temp = self.head
            print(id(temp))
            del self.head
            self.head = temp.next
            #self.head = self.head.next

            return
        
        while current is not None and current.next.data != key:
            current = current.next

        if current is None:
            return
        else:
            temp = current.next
            del current.next
            #current.next = current.next.next
            current.next = temp.next


ll = SinglyLinkedList()
ll.append(1)
ll.append(2)
ll.append(67)
ll.append(23)
print(ll.find(23))
print(ll.find(2))
ll.remove(2)
print(ll.find(2))

