from ctypes import sizeof


class myStack:
  
  #Please read sample.java file before starting.
  #Kindly include Time and Space complexity at top of each file
  def __init__(self):
    self.stack =[]
         
  def isEmpty(self):
    return self.stack == []
       
         
  def push(self, item):
    self.stack.append(item)
         
  def pop(self):
    if (not self.isEmpty()):
      lastElement = self.stack[-1]
      del(self.stack[-1])
      return lastElement
    else:
      return("Stack already empty")
    
  def peek(self):
    return self.stack[-1]
        
  def size(self):
    return sizeof(self.stack)
         
  def show(self):
    return self.stack
         

s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())
