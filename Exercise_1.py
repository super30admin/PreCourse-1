class myStack:
     def __init__(self):
          self.res  = []
         
     def isEmpty(self):
          if len(self.res):
               return True
         
     def push(self, item):
          self.res.append(item)
         
     def pop(self):
        self.res.pop()
        
     def peek(self):
          if self.res:
               return self.res[-1]
        
     def size(self):
          return len(self.res)
         
     def show(self):
          print (self.res)
         

s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())
