'''
Time Complexity : 
  Given implicitly
  
Space Complexity : 
  O(n), where n is number of elements in stack

Did this code successfully run on Leetcode : 
  Not on leetcode

Any problem you faced while coding this : 
  pop functionality


#Your code here along with comments explaining your approach

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

    def append(self, data):
        """
        Insert a new element at the end of the list.
        Takes O(n) time.
        """
        newnode = ListNode(data)
        if self.head == None:
            self.head = newnode
        else:
            cur = self.head
            while cur.next:
                cur = cur.next
            cur.next = newnode

    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        cur = self.head
        while cur:
            if cur.data == key:
                return cur.data
            cur = cur.next
        return None
        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        cur = self.head
        if cur.data == key:
            self.head = cur.next
        else:
            prev = ListNode(None)
            while cur:
                if cur.data == key:
                    prev.next = cur.next
                    return
                prev = cur
                cur = cur.next

    def show(self):
        cur = self.head
        while cur:
            print(cur.data)
            cur = cur.next

s = SinglyLinkedList()
s.append('1')
s.append('2')
s.append('3')
print('Linked List after insertions')
s.show()

print('Find keys 2 and 3')
print(s.find('2'))
print(s.find('3'))
s.remove('2')
print('After removing 2')
s.show()
print('Linked List after insertions')
s.append('4')
s.show()
