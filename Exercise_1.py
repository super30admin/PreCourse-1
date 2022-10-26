class myStack:


  #Please read sample.java file before starting.
  #Kindly include Time and Space complexity at top of each file
  def __init__(self):
    self.MAX=1000
    self.L=[None]*self.MAX
    self.top=-1
         
  def isEmpty(self):
    if(self.top==-1):
      return True
    return False
         
  def push(self, item):
    if(self.top+1==self.MAX):
      print("Stack Overflow")
    else:
      self.top+=1
      self.L[self.top]=item
      
  
  def pop(self):
    if(self.top==-1):
      return 0
    else:
      a=self.L[self.top]
      self.top-=1
      return a
      
  def peek(self):
    if(self.top==-1):
      return 0
    else:
      return self.L[self.top]
      
  def size(self):
    return self.top+1
         
  def show(self):
    if(self.top==-1):
      return []
    return self.L[:self.top+1]
         

s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())
