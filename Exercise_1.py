class myStack:
     def __init__(self):
          self.myStack = []
         
     def isEmpty(self):
          if len(self.myStack) == 0:
               return True
          else:
               return False
         
     def push(self, item):
          self.myStack.append(item)
         
     def pop(self):
          if len(self.myStack) == 0:
               return
          else:
               return self.myStack.pop()
        
     def peek(self):
          if len(self.myStack) == 0:
               return
          else:
               return self.myStack[-1]
        
     def size(self):
          if not self.myStack:
               return 0
          else:
               return len(self.myStack)
         
     def show(self):
          if not self.myStack:
               return
          else:
               print(self.myStack)
         

# Implement stack using array
s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())