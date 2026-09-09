'''
Time Complexity : O(1)
Space Complexity : O(1)
Did this code successfully run on Leetcode : Yes, but the question on leetcode was using Queues and not Arrays
Any problem you faced while coding this : No

'''

class myStack:
  #Please read sample.java file before starting.
  #Kindly include Time and Space complexity at top of each file
  def __init__(self):
    self.storage = []
         
  def isEmpty(self):
    if len(self.storage) == 0:
      return True
    return False
         
         
  def push(self, item):
    self.storage.append(item)
         
  def pop(self):
    if not self.isEmpty():
      self.storage.pop()
        
        
  def peek(self):
    if not self.isEmpty():
      return self.storage[-1]
            
  def size(self):
    return len(self.storage)
         
  def show(self):
    return self.storage
         

s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())
