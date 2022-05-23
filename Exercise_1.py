# Time Complexity : O(1)
# Space Complexity : O(n)
# Did this code successfully run on Leetcode : N/A
# Any problem you faced while coding this : No

class myStack:
  def __init__(self):
    self.stack = list()
          
  def isEmpty(self):
    if(len(self.stack)==0):
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
s.push('1')
s.push('2')
print(s.pop())
print(s.show())
