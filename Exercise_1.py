# Time Complexity : O(1) for most of the stack operations, O(n) for show to stringify whole stack
# Space Complexity : O(n)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

class myStack:
  #Please read sample.java file before starting.
  #Kindly include Time and Space complexity at top of each file
  def __init__(self):
    self.stack = list()
         
  def isEmpty(self):
    return len(self.stack) == 0
         
  def push(self, item):
    return self.stack.append(item)
         
  def pop(self):
    if self.isEmpty(): return None
    return self.stack.pop()
        
  def peek(self):
    if self.isEmpty(): return None
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
