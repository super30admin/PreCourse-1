# Time Complexity : Every major function takes O(N) time
# Space Complexity : O(N) space for each ListNode object created and same for append everything else is O(1)
# Did this code successfully run on Leetcode : 
# successfully run on local device: .
# Any problem you faced while coding this :
# I don't know what logic to use.
#pending
from typing import Counter, List


class ListNode:
    """
    A node in a singly-linked list.
    """
    def __init__(self, data):
        self.data = data
        self.next = None
    
class SinglyLinkedList:
    def __init__(self):
        """
        Create a new singly-linked list.
        Takes O(1) time.
        """
        self.head = None
        self.counter = 0
        

    def append(self, data):
        """
        Insert a new element at the end of the list.
        Takes O(n) time.
        """
        newNode = ListNode(data)
        if self.head == None or self.counter == 0:
            self.head = newNode
            self.counter += 1
        else:
            curr = self.head
            while(curr.next != None):
                curr = curr.next
            curr.next = newNode
            self.counter += 1
        
        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        if self.head == None or self.counter == 0: return None
        curr = self.head
        while(curr.next != None):
            if curr.data == key: return curr
            curr = curr.next
        return None
            
        
        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        if self.counter == 0 or self.head == None: return None
        curr = self.head
        # 3 cases 
        # if element is first 
        # if element is last
        # if element is in somewhere middle
        prevNode = None
        for i in range(self.counter):
            if curr.data == key:
                if curr == self.head:
                    if self.head.next is None:
                        self.head = None
                        self.counter -= 1
                        break
                    else: 
                        self.head = self.head.next
                        self.counter -= 1
                        break
                elif curr.next == None:
                    prevNode.next = None
                    curr = None
                    self.counter -= 1
                    break
                else:
                    prevNode.next = curr.next
                    curr = None
                    self.counter -= 1  
                    break         
            else:
                prevNode = curr
                curr = curr.next
        
list = SinglyLinkedList()
print(list.append(10))
print(list.append(20))
print(list.append(30))
print(list.append(40))
print(list.append(50))
print(list.append(60))
print(list.find(40))
# print(list.remove(50))
# print(list.remove(10))
print(list.remove(60))
# print(list.find(60))
# print(list)
