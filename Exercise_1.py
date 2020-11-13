class myStack:
     def __init__(self):
          self.stack = []
          self.n = 0
         
     def isEmpty(self):
          if self.n == 0:
               return True
          return False
         
     def push(self, item):
          self.stack.append(item)
          self.n += 1
         
     def pop(self):
          if self.isEmpty():
               return None
          self.n -= 1
          return self.stack.pop()
        
     def peek(self):
          if self.isEmpty():
               return None
          return self.stack[-1]

     def size(self):
          return self.n
         
     def show(self):
          return self.stack

         

s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())
