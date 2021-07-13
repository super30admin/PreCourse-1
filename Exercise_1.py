'''
Implement Stack using Array
'''
class myStack:
     def __init__(self):
          self.stack = []
          self.length = 1000
         
     def isEmpty(self):
          return not self.stack
         
     def push(self, item):
          return self.stack.append(item) if self.size() < 1000 else "Stack Overflow"
         
     def pop(self):
          return self.stack.pop() if self.stack else "Stack Underflow"
        
     def peek(self):
          return self.stack[-1] if self.stack else "Stack Underflow"
        
     def size(self):
          return len(self.stack)
         
     def show(self):
          return self.stack
         
s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())
