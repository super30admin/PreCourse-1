class myStack:
     def __init__(self):
          self.stack = []
         
     def isEmpty(self):
          if len(self.stack)==0:
               return float("-inf")
         
     def push(self, item):
          sel.stack.append(item)
         
     def pop(self):
          if isEmpty(self.stack):
               return float("-inf")
          return self.stack.pop()
        
        
     def peek(self):
          if isEmpty(self.stack):
               return float("-inf")
          return self.stack[len(self.stack)-1]          
        
     def size(self):
          return len(self.stack)
         
     def show(self):
          return self.stack
         

s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())
