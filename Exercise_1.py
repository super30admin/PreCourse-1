class myStack:
     def __init__(self):
         self.s=[]

     def isEmpty(self):
          return self.s==[]

         
     def push(self, item):
          self.s.append(item)
         
     def pop(self):
          return self.s.pop()
        
     def peek(self):
          if s:
               return self.s[-1]
          else:
               return None
        
     def size(self):
          return len(self.s)
         
     def show(self):
          return [self.s[i] for i in range(len(self.s)-1,-1,-1)]

s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())
