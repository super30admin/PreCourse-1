class myStack:
  #Please read sample.java file before starting.
  #Kindly include Time and Space complexity at top of each file
     def __init__(self):
       self.stack = []
       
     def isEmpty(self):
       if(len(self.stack)==0):
         return True
         
     def push(self, item):
       return self.stack.append(item)
         
     def pop(self):
       if(self.isEmpty()):
         return None
       return self.stack.pop(self.size()-1)
        
     def peek(self):
       if(self.isEmpty()):
         return None
       return self.stack[-1]
        
     def size(self):
       return len(self.stack)
         
     def show(self):
       return self.stack
         
s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())
