#Implement Stack using Array.

class myStack:
     def __init__(self):
          self.stack = []
         
     def isEmpty(self):
          if len(self.stack) == 0:
               return True
         
     def push(self, item):
          self.stack.append(item)
         
     def pop(self):
          self.stack.pop()

     def peek(self):
          return self.stack.pop()
        
     def size(self):
          return len(self.stack)
         
     def show(self):
          print(self.stack)
         

s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())
