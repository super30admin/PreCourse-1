# Time Complexity : O(N)
# Space Complexity : O(N)
# Did this code successfully run on Leetcode : Was not able to 
# find a similar question on leetcode. Tested locally instead. 
# Any problem you faced while coding this : Noticed it took me 
# a couple of attempts. 


# Your code here along with comments explaining your approach
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
        # if self.head is None, then just add a node to self.head. 
        if self.head==None:
            self.head=ListNode(data=data)
        # if self.head is not None, the traverse to the end and append new node. 
        else:
            node = self.head
            while(node.next!=None):
                node = node.next
            node.next=ListNode(data=data)
        
        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        node = self.head
        # if node.data is key, return key. Otherwise, continue to traverse. 
        while(node!=None):
            if node.data==key:
                return key
            temp = node.next
            node = temp
        return None
        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        # if first node contains key, start with second node. 
        if self.head.data == key:
            self.head = self.head.next
        # if first node does not contain key, keep track of node and next_node, 
        # and make node.next the next_node.next if key is found in next_node.
        else:
            node = self.head
            while(node.next!=None):
                if node.next.data==key:
                    node.next = node.next.next
                    break
                node = node.next
        

    def print_list(self):
        node = self.head
        while(node!=None):
            print(node.data)
            node = node.next

s = SinglyLinkedList()
s.append(1)
s.append(2)
s.append(3)
s.print_list()
print(s.find(3))
print(s.find(4))
s.remove(3)
print(s.find(3))
s.print_list()
print()
s = SinglyLinkedList()
s.append(1)
s.print_list()
s.remove(1)
s.print_list()