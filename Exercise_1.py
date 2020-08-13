class myStack:
     def __init__(self):
          self.res = []
         
     def isEmpty(self):
          return len(self.res)==0
         
     def push(self, item):
          self.res.append(item)
         
     def pop(self):
          if len(self.res)>0:
               val = self.res.pop()
               print("Popped val : ", end=" ")
          return val
        
     def peek(self):
          if len(self.res)>0:
               return self.res[-1]
          return -1
               
     def size(self):
          return len(self.res)
         
     def show(self):
          return self.res
         

s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())
