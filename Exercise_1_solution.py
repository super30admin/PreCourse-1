#!/usr/bin/env python
# coding: utf-8

# In[2]:


# Implementation of Stack using Arrays

class myStack:
    
    def __init__(self):     
        self.items = []
        self.ssize = 0
        return     
         
    def isEmpty(self):
        if self.items == []:
            return True
        else:
            return False
         
    def push(self, item):
        self.items.append(item)
        self.ssize += 1
        return
         
    def pop(self):
        if not self.isEmpty():
            self.items.pop()
            self.ssize -= 1
        return      
        
    def peek(self):
        if not self.isEmpty():   
            return self.items[-1]
    
        
    def size(self):
        return self.ssize
         
    def show(self):
        for i in self.items:
            print(self.items)
        return
         

s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())

