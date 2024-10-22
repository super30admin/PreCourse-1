# Time Complexity : for each operation, O(1)
# Space Complexity : O(N) where N is the maximum length of integer inputs

class myStack:

  #Please read sample.java file before starting.
  #Kindly include Time and Space complexity at top of each file
  def __init__(self):
    self.stack = []

  def isEmpty(self):
    if len(self.stack) != 0:
      return True
    return False
        
  def push(self, item):
    self.stack.append(item)
    return
        

  def pop(self):
    return self.stack.pop()
      
  def peek(self):
    if self.stack:
      return self.stack[-1]
    
  def size(self):
    return len(self.stack)
      
  def show(self):
    return self.stack
         

s = myStack()
s.push('1')
s.push('2')
print(s.peek())
print(s.isEmpty())
print(s.pop())
print(s.show())
