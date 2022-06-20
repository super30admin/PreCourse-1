class myStack:
  #Please read sample.java file before starting.
  #Kindly include Time and Space complexity at top of each file
     def __init__(self):
      self.stack=[]

     def isEmpty(self):
      if self.size()==0:
        return True
      else:
        return False
         
     def push(self, item):
      self.stack.append(item)
      
         
     def pop(self):
      if self.size()!=0:
        return self.stack.pop()
      else:
        return 0
        
     def peek(self):
      if self.size()!=0:
        return self.stack[-1]
      else:
        return 0
        
     def size(self):
      if len(self.stack)!=0:
        return len(self.stack)
      else:
        return 0
         
     def show(self):
      
      return self.stack
         

s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())
