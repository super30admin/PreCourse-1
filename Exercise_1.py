# Submitted by : Aryan Singh_RN12MAY2023 
# Time Complexity : O(1)
# Space Complexity : O(n)
# Did this code successfully run on Leetcode : Not applicable
# Any problem you faced while coding this : Python init implementation


class myStack:
  #Please read sample.java file before starting.
  #Kindly include Time and Space complexity at top of each file
  def __init__(self):
    self.stack = []
      
  def isEmpty(self):
    if len(self.stack) == 0:
      return True
    else:
      return False
        
  def push(self, item):
    self.stack.append(item)
      
  def pop(self):
    return self.stack.pop()
    
  def peek(self):
    return self.stack[-1]
    
  def size(self):
      return len(self.stack)
  
  def show(self):
    return self.stack
      

s = myStack()
print(s.isEmpty())
s.push('1')
s.push('2')
print(s.isEmpty())
print(s.pop())
s.push('3')
print(s.peek())
print(s.show())
print(s.size())
