from typing import ItemsView


class myStack:
     def __init__(self):
          self.stack = []
          self.max = 8 
          self.top = 0 

     def isEmpty(self):
          return len(self.stack) ==0
     
     def push(self, item):
          if self.top >= self.max:
               return ("stack is full") 
          self.stack.append(item)
          print(item + " is being pushed to stack")
          self.top +=1

     def pop(self):
          if(self.isEmpty()):
               return ("Stack is empty")
          return self.stack.pop()
          self.top -=1
        
     def peek(self):
          if(self.isEmpty()):
               return ("Stack is empty")
          return self.stack[len(self.stack)-1]

     def size(self):
         return self.top
     def show(self):
          return self.stack
         

s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())
