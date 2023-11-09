# Time Complexity : O(1) for all operations
# Space Complexity : O(N)
class myStack:
  #Please read sample.java file before starting.
  #Kindly include Time and Space complexity at top of each file
  def __init__(self):
    self.stack = []
  
  def isEmpty(self):
    if len(self.stack) == 0:
      return True
    return False
         
  def push(self, item):
    self.stack.append(item) 

  def pop(self):
    if not self.isEmpty():
      return self.stack.pop()
         
  def peek(self):
    if not self.isEmpty():
      return self.stack[0]
     
  def size(self):
    return len(self.stack)
      
  def show(self):
    if not self.isEmpty():
      return self.stack
         

s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())
