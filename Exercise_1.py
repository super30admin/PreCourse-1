class myStack:
     # tc O(1) for all operations, sc O(n) total space.
     def __init__(self):
          self.stack = []
         
     def isEmpty(self):
          return not self.stack
         
     def push(self, item):
          self.stack.append(item)
          
     def pop(self):
          return self.stack.pop()
        
     def peek(self):
          return self.stack[-1]
        
     def size(self):
          return len(self.stack)
         
     def show(self):
          return self.stack
         

s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())
