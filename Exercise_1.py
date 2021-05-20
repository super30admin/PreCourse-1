class myStack:
     def __init__(self):
          self.stack = []

     def isEmpty(self):
          if len(self.stack) < 1:
              return "Empty"
          return "Not Empty"

     def push(self, item):
          if item not in self.stack:
               self.stack.append(item)
               return True
          else:
               return False

     def pop(self):
          if len(self.stack) < 1:
               return "No elements in stack"
          else:
               return self.stack.pop()
        
     def peek(self):
          if len(self.stack) > 0:
               return self.stack[-1]
          return "Stack Empty"

     def size(self):
          return len(self.stack)
         
     def show(self):
          return self.stack
         

s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())
