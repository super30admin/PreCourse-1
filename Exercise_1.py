#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""
Created on Sun Feb  8 16:20:59 2026

@author: rishigoswamy
"""

class myStack:
  #Please read sample.java file before starting.
  #Kindly include Time and Space complexity at top of each file
     def __init__(self):
         self.maxSize = 1000
         self.currentSize = 0
         self.stack = []
         
     def isEmpty(self):
         return not self.stack 
         
     def push(self, item):
         
         if self.currentSize < self.maxSize:
             self.stack.append(item)
             self.currentSize+=1
         else:
             print("Stack Overflow")
         
     def pop(self):
         if self.stack:
             self.currentSize-=1
             return self.stack.pop()
         else:
            print("Stack Underflow")
            return 0
        
        
     def peek(self):
         if self.stack:
             return self.stack[-1]
         else:
            print("Stack Underflow")
            return 0
        
     def size(self):
         return len(self.stack)
         
     def show(self):
         for item in self.stack:
             print(item)
         return self.stack
         

s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())
