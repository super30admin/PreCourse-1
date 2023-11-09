class myStack:
     def __init__(self):
         self.stack = []

     def isEmpty(self):
         if len(stack) == 0:
             print("The stack is currently empty")
     
         
     def push(self, item):
         self.stack.append(item)
         
     def pop(self):
         self.stack.pop()
        
        
     def peek(self):
         if self.stack:
             print(self.stack[-1])
        
     def size(self):
         print(len(self.stack))
         
     def show(self):
         print(self.stack)
         

s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())