class myStack:
     def __init__(self):
          self.stack = []
         
     def isEmpty(self):
          if not self.stack:
               return True
          return False
         
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
print(s.isEmpty())
s.push('1')
s.push('2')
s.push('3')
s.push('4')
s.push('5')
print(s.peek())
s.push('6')
s.push('7')
s.push('8')
print(s.size())
print(s.peek())
print(s.isEmpty())
print(s.pop())
print(s.pop())
print(s.show())
