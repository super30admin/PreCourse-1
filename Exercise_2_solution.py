#!/usr/bin/env python
# coding: utf-8

# In[2]:


# Implementation of a Stack using a LinkedList

class Node:
    def __init__(self, data): 
        self.data = data
        self.next = None
        
class Stack:
    def __init__(self):
        self.head = None
        self.size = 0
        return
        
    def push(self, data):
        new_node = Node(data)
        if self.head is None:
            self.head = new_node
            self.size += 1
            return
        cur = self.head
        while cur.next:
            cur = cur.next
        cur.next = new_node
        self.size += 1
        return
        
    def pop(self):
        if not self.head:
            return
        cur = self.head
        prev = None
        while cur.next:
            prev = cur
            cur = cur.next
        val = cur.data
        prev.next = None
        cur = None
        self.size -= 1
        return val
    
    def display(self):
        if self.head is None:
            return None
        cur = self.head
        while cur:
            print(cur.data)
            cur = cur.next
        return
    
                
a_stack = Stack()
while True:
    print('push <value>')
    print('pop')
    print('quit')
    do = input('What would you like to do? ').split()
 
    operation = do[0].strip().lower()
    if operation == 'push':
        a_stack.push(int(do[1]))
    elif operation == 'pop':
        popped = a_stack.pop()
        if popped is None:
            print('Stack is empty.')
        else:
            print('Popped value: ', int(popped))
    elif operation == 'quit':
        break
    elif operation == 'display' :
        a_stack.display()

