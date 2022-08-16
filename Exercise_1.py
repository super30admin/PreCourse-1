class myStack:
  #Please read sample.java file before starting.
  #Kindly include Time and Space complexity at top of each file
     def __init__(self):
      self.stack=[]
         
     def isEmpty(self):
      return len(self.stack)<=0 
         
     def push(self, item):
      return self.stack.append(item)
         
     def pop(self):
      if len(self.stack)>0:
        return self.stack.pop()
      else:
        return "Oops! The length of array is less than 0"
      
          
     def peek(self):
      if len(self.stack)>0:
        return self.stack(-1)
      else:
        return "Oops! The length of array is less than 0"
        
     def size(self):
      return len(self.stack)
         
     def show(self):
      return self.stack
         

s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())