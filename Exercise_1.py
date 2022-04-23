class myStack:
  def __init__(self):
    self.top = -1
    self.stack = []
    self.size = 1000

  def isEmpty(self):
    if len(self.stack) == 0:
      return True
    else:
      return False
    
  def push(self, item):
    if len(self.stack) < self.size:
      self.stack.append(item)
      self.top = item
    else:
      return -1   
         
  def pop(self):
    if not self.isEmpty():
      return self.stack.pop()
    else:
      return -1
         
  def peek(self):
    if not self.isEmpty():
      return self.top
    else:
      return -1           
        
  def size(self):
    return self.size  
        
  def show(self):
    return self.stack   
         
     
         

s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())