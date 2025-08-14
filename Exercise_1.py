'''
Time Complexity:
  1) isEmpty(), push(), pop(), peek() : O(1)
Space Complexity:
  1) O(1000) or O(max_size)
'''

class myStack:
  #Please read sample.java file before starting.
  #Kindly include Time and Space complexity at top of each file
  def __init__(self):
    self.max_size = 1000
    self.myStack = [] 
      
  def isEmpty(self):
    if self.size()==0:
      return True
    else:
      return False
      
  def push(self, item):
    if self.size()==self.max_size:
      return False
    self.myStack.append(item)
    return True

  def pop(self):
    if self.isEmpty():
      print("Stack underflow")
      return 0
    last = self.myStack[-1]
    self.myStack.pop()
    return last
    
  def peek(self):
    if self.isEmpty():
      return None
    return self.myStack[-1]
    
  def size(self):
    return len(self.myStack)
      
  def show(self):
    return self.myStack

s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())
