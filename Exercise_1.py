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
          if not self.isEmpty():
               return self.stack.pop()
          else:
               return None
        
     def peek(self):
          if not self.isEmpty():
               return self.stack[-1]
          else:
               return None
     def size(self):
         return len(self.stack)
     def show(self):
          print(self.stack)

s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())
