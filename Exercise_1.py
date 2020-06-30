class myStack:
     def __init__(self):
          self.stack = []
         
     def isEmpty(self):
          if len(self.stack) == 0:
               return True
          else:
               return False
         
     def push(self, item):
          self.stack.append(item)

     def pop(self):
          if self.isEmpty():
               print("ERROR: The stack is underflow (empty)")
               return -1
          else:
               return self.stack.pop(-1)
        
     def peek(self):
          if self.isEmpty():
               print("ERROR: The stack is underflow (empty)")
               return -1
          else:
               return self.stack[-1]
        
     def size(self):
          return len(self.stack)
         
     def show(self):
          if self.isEmpty():
               print("ERROR: The stack is underflow (empty)")
               return -1
          else:
               return self.stack
         

s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())
