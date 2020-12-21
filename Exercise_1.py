class myStack:
     #O(1) for all
     def __init__(self):
         self.stack=[]
     def isEmpty(self):
          if len(self.stack)==0:
              return True
          else:
               return False
     def push(self, item):
         self.stack.append(item)
     def pop(self):
          if self.stack:
               pop=self.stack.pop()
               return(pop)
          return -1
        
     def peek(self):
          return self.stack[-1]
        
     def size(self):
          return len(self.stack)
         
     def show(self):
          return(self.stack)
         

s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())