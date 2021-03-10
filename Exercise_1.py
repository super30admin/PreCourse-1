class myStack:
     def __init__(self):
          self.s = []

     def isEmpty(self):
          return self.size() == 0
         
     def push(self, item):
          self.s.append(item)
         
     def pop(self):
          return self.s.pop()
          
     def peek(self):
          if self.isEmpty():
               raise Exception("Stack empty!")
          return self.s[-1]
        
     def size(self):
          return len(self.s)
         
     def show(self):
          return self.s 
         

s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())
