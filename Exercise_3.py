'''

Time Complexity : 
  push - O(1)
  find - O(N)
  show - O(N)

Space Complexity : O(N) - All functions has O(1) Space Complexity

Did this code successfully run on Leetcode : Yes

Your code here along with comments explaining your approach:

'''
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
        self.tail = None

    def append(self, data):
        """
        Insert a new element at the end of the list.
        Takes O(1) time.
        """
        if not self.head:
            self.head = ListNode(data)
            self.tail = self.head
        else:
            self.tail.next = ListNode(data)
            self.tail = self.tail.next
        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        fakehead = self.head
        while fakehead:
            if fakehead.data == key:
                return key
            fakehead = fakehead.next
    
    def show(self):
        """
        Shows the current linked list
        Takes O(N) time
        """
        fakehead = self.head
        while fakehead:
            print(fakehead.data)
            fakehead = fakehead.next

    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        fakehead = self.head
        prev = None
        while fakehead:
            if fakehead.data == key:
                if prev:
                    prev.next = fakehead.next
                    del fakehead
                else:
                    self.head = self.head.next
                return key
            prev = fakehead
            fakehead = fakehead.next


ll = SinglyLinkedList()
ll.append(20)
ll.append(40)
print(ll.find(20))
ll.append(70)
ll.remove(40)
print(ll.find(40))
ll.show()