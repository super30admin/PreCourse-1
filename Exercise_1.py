# Time Complexity : O(len(self.stack)) = O(N)  -- In show() function self.stack[::-1] is equivalent to iterating the stack in reverse order
# Space Complexity : O(len(self.stack)) = O(N)
# Did this code successfully run on Leetcode : I could not find the Leetcode link for this
# Any problem you faced while coding this : No, just small case how to handle functions pop(), peek() and show() when the stack is empty


# Your code here along with comments explaining your approach

class myStack:
  #Please read sample.java file before starting.
  #Kindly include Time and Space complexity at top of each file
  def __init__(self):
    self.stack = []
      
  def isEmpty(self):
    return len(self.stack) == 0
      
  def push(self, item):
    self.stack.append(item)
      
  def pop(self):
    if(not self.isEmpty()):
      return self.stack.pop()
    else:
      return "Stack is Empty"
            
    
  def peek(self):
    if(not self.isEmpty()):
      return self.stack[-1]
    else:
      return "Stack is Empty"
    
  def size(self):
    return len(self.stack)
      
  def show(self):
    if(not self.isEmpty()):
      # Returns a list in reverse order
      return self.stack[::-1]
    else:
      return "Stack is Empty"
         
# For testing purpose
s = myStack()
print(s.peek())
print(s.pop())
print(s.size())
print(s.isEmpty())
print(s.show())
s.push('11')
s.push('21')
s.push('20')
print(s.peek())
s.push('22')
s.push('22')
s.push('16')
print(s.peek())
print(s.pop())
print(s.isEmpty())
print(s.size())
print(s.show())
