#Author: Henil Doshi

class myStack:
     def __init__(self):
          self.stack = []
         
     def isEmpty(self):
          return len(self.stack) == 0
         
     def push(self, item):
          self.stack.append(item)
         
     def pop(self):
          popElement = self.stack[len(self.stack)-1]
          self.stack.pop()
          return popElement
        
     def peek(self):
          return self.stack[len(self.stack)-1]
        
     def size(self):
          return len(self.stack)
         
     def show(self):
          return self.stack
         

s = myStack()
s.push('1')
s.push('2')
print(s.show())
print(s.isEmpty())
print(s.peek())
print(s.show())
print(s.pop())
print(s.size())
print(s.show())
