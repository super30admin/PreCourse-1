class myStack:
     def __init__(self):
          self.stack = []
         
     def isEmpty(self):
          if self.stack == []:
               return True
          else:
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
          for i in range(len(self.stack)-1,-1,-1):
               print(self.stack[i])
         

s = myStack()
s.push('1')
s.push('2')
s.push('3')
s.push('4')
print(s.pop())
print(s.show())
