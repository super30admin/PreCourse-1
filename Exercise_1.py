class myStack:
  #Time Complexity : O(1)
  # #Space Complexity : O(n)
  # Did this code successfully run on Leetcode :  Yes
  # Any problem you faced while coding this : No
  def __init__(self):
    self.stack = []

  def isEmpty(self):
    return len(self.stack)==0
  
  def push(self, item):
    self.stack.append(item)

  def pop(self):
    if self.stack:
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
print(s.pop())
print(s.show())
