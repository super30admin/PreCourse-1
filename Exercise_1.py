class myStack:
     def __init__(self):
          self.stack = []
         
     def isEmpty(self):
          if len(self.stack) == 0:
               return True
          return False
         
     def push(self, item):
          self.stack.append(item)
         
     def pop(self):
          self.stack.pop()
        
        
     def peek(self):
          top = self.stack[-1]
          return top
        
     def size(self):
          return len(self.stack)
         
     def show(self):
          return (self.stack)
         

s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())
