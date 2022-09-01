#time complexity --> O(1)
#space complexity --> O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No
class ListNode:
    """
    A node in a singly-linked list.
    """
    def __init__(self, data=None, next=None):
        self.data = data
        self.next = next
    def getData(self):
        return self.data
    def setData(self,data):
        self.data = data
    def getNextNode(self):
        return self.next
    def setNextNode(self,node):
        self.next = node
    
class SinglyLinkedList:
    def __init__(self):
        """
        Create a new singly-linked list.
        Takes O(1) time.
        """
        self.head = None
        self.size = 0

    def append(self, data):
        """
        Insert a new element at the end of the list.
        Takes O(n) time.
        """
        node = ListNode(data, self.head)
        self.head = node
        # incrementing the size of the linked list
        self.size += 1
        return True
        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        curr = self.head
        while curr:
            if curr.getData() == key:
                return True
            else:
                curr = curr.getNextNode()
        return False
        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        prev = None
        curr = self.head
        while curr:
            if curr.getData() == key:
                if prev:
                    prev.setNextNode(curr.getNextNode())
                else:
                    self.head = curr.getNextNode()
                return True
                
            prev = curr
            curr = curr.getNextNode()
