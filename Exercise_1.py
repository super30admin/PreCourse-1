"""
Using simple list operations to implement the following functions
push == > append at the end which is the top of stack
pop ==> removes the last element by passing no index to pop function
"""

class myStack:
     def __init__(self):
         self.stack = []

     def isEmpty(self):
          if self.stack:
               return True
          else:
               return False
         
     def push(self, item):
          self.stack.append(item)

     def pop(self):
          return self.stack.pop()
        
     def peek(self):
          return self.stack[[-1]]
        
     def size(self):
          return len(self.stack)
         
     def show(self):
          return self.stack
         

s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())
