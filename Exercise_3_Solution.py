#!/usr/bin/env python
# coding: utf-8

# In[40]:


# Implementation of a Linked list

class ListNode:  
    """
    A node in a singly-linked list.
    """
    def __init__(self,data = None, next = None):
        self.data = data
        self.next = None
        return
    
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
        new_node = ListNode(data)
        if self.head is None:
            self.head = new_node
            self.size += 1
            return
        cur_node = self.head
        self.size += 1
        while cur_node.next:
            cur_node = cur_node.next
        cur_node.next = new_node
        return
        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        if not self.head:
            return None
        cur_node = self.head
        while cur_node and cur_node.data != key:
            cur_node = cur_node.next
        if not cur_node:
            return None
        return cur_node.data    
    
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        # When we remove the first element
        
        if self.head.data == key:
            self.head = self.head.next
            self.size -= 1
            return
        # Removing any element other than the first element
        prev = None
        cur_node  = self.head
        while cur_node and cur_node.data != key:
            prev = cur_node
            cur_node = cur_node.next
        if not cur_node:
            return None
        prev.next = cur_node.next
        cur_node = None
        self.size -= 1
        return
    
    def print_list(self):
        cur_node = self.head
        if not self.head:
            return False
        while cur_node:
            print(cur_node.data)
            cur_node = cur_node.next
        return
    
    


# In[41]:


llist = SinglyLinkedList()
llist.append(0)
llist.append(1)
llist.append(2)
llist.append(3)
llist.append(4)
print(llist.find(2))
llist.remove(0)
llist.remove(2)
llist.print_list()

