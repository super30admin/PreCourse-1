class myStack:
  #Please read sample.java file before starting.
  #Kindly include Time and Space complexity at top of each file
     def __init__(self):
        self.s=[]

     def isEmpty(self):
         return len(self.s)==0
          
         
     def push(self, item):
         self.s.append(item)
          
         
     def pop(self):
         if not self.isEmpty():
             return self.s.pop()
         else:
             return "Stack is empty"
          
        
        
     def peek(self):
         if not self.isEmpty():
             return self.s[-1]
         else:
             return "Stack is empty"
          
        
     def size(self):
         return len(self.s)
         
     def show(self):
         return self.s
         

s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())
