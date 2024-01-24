# Time Complexity : O(1)
# Space Complexity : O(n)
# Did this code successfully run on Leetcode : NA
# Any problem you faced while coding this : NA

class myStack:
  #Please read sample.java file before starting.
  #Kindly include Time and Space complexity at top of each file
  def __init__(self):
    self.top = -1
    self.stack = []

  def isEmpty(self):
    ans = False
    if (self.top == -1):
      ans = True
    return ans

  def push(self, item):
    self.stack.append(item)
    self.top += 1

  def pop(self):
    if (self.top == -1):
      return
    ans = self.stack.pop()
    self.top -= 1  
    return ans
          
  def peek(self):
    return self.stack[self.top] 
          
  def size(self):
    return self.top + 1
         
  def show(self):
    return self.stack[self.top]

s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())
