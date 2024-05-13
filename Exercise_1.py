class myStack:
  #Please read sample.java file before starting.
  #Kindly include Time and Space complexity at top of each file
     def __init__(self, size = 10): 
          self.stack = []
          self.size = size
         
     # time O(1)
     def isEmpty(self):   
          return len(self.stack) == 0
     #time O(1)
     def push(self, item):
          if len(self.stack) >= self.size:
               raise Exception("Stack overflow")
          else:
               self.stack.append(item)
     #time O(1)     
     def pop(self):
          if len(self.stack) <= 0:
               raise Exception("stack underflow")
          else:
               return self.stack.pop()
     # time O(1)
     def peek(self):
          if len(self.stack) <= 0:
               raise Exception("stack underflow")
          else:
               self.stack[-1]
        
     def size(self):
          return len(self.stack) # time O(1)
     # time O(n)    
     def show(self):
          if self.isEmpty():
               raise Exception("Stack empty")
          else:
               for i in self.stack:
                    print(i)
         

s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())
