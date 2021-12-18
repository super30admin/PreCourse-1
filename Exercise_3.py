# Time Complexity : don't know how to calculate it in real program
# Space Complexity : don't know
# Did this code successfully run on Leetcode : 
# successfully run on local device: .
# Any problem you faced while coding this :
# I don't know what logic to use.

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
        newLinkedlistNode = ListNode(data)
        if self.head == None:
            self.head = newLinkedlistNode
        else: 
            tmpNewHead = self.head
            while tmpNewHead.next != None:
                tmpNewHead = tmpNewHead.next
            tmpNewHead.next = newLinkedlistNode
        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
