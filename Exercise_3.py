#Time Complexity - O(n) for push, O(1) for peek/pop
#Space Complexity - O(1)

class ListNode:
    """
    A node in a singly-linked list.
    """
    def __init__(self, data=None, next=None):
        self.data=data
        self.next=next

    def getData(self):
        return self.data

    def getNextNode(self):
        return self.next
    
class SinglyLinkedList:
    def __init__(self):
        """
        Create a new singly-linked list.
        Takes O(1) time.
        """
        self.head = None
        self.size=0

    def append(self, data):
        node= ListNode(data, self.head)
        self.head=node
        self.size+=1
        """
        Insert a new element at the end of the list.
        Takes O(n) time.
        """
        
    def find(self, key):
        curr = self.head
        while curr:
            if curr.getData()==key:
                return True
            else:
                curr=curr.getNextNode()
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        
    def remove(self, key):
        prev = None
        curr=self.head
        while curr:
            if curr.getData()==key:
                if prev:
                    prev.setNextNode(curr.getNextNode())
                else:
                    self.head = curr.getNextNode()
                return True
            prev = curr
            curr = curr.getNextNode()
                    

        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
