class myStack:

  #Please read sample.java file before starting.
  #Kindly include Time and Space complexity at top of each file
  def __init__(self):
    self.stack = []
  
           
  def isEmpty(self):
    if(len(self.stack)>0):
      return False
    else:
      return True
         
  def push(self, item):
    self.stack.append(item)
    print(self.stack)
         
  def pop(self):
    if(len(self.stack)<=0):
      return("Stack empty")
    else:
      del(self.stack[-1])
         
  def peek(self):
    return self.stack[-1]
        
  def size(self):
    return(len(self.stack))
    
         
  def show(self):
    return self.stack
         

s = myStack()
s.push('1')
s.push('2')
s.push('3')
print(s.pop())
print(s.size())
print(s.peek())
print(s.stack)
print(s.show())
