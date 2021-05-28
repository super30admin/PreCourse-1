"""
Stack implementation using Arry or List 

Time Complexity : push - O(1), pop - O(1)
    
Space Complexity : O(n) where n is number of elements in the stack 
    
"""

class myStack:
    
     def __init__(self):
         self.stack = []
         
     def isEmpty(self):
         return self.stack == []
         
     def push(self, item):
         self.stack.append(item)
         
     def pop(self):
         if not self.stack:
             return None
         return self.stack.pop()
         
     def peek(self):
         if not self.stack:
             return None 
         return self.stack[-1]
        
     def size(self):
         return len(self.stack)
         
     def show(self):
         return self.stack
         

s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())
