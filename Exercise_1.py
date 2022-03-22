# Time Complexity : O(1)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode :yes
# Any problem you faced while coding this :no


# Your code here along with comments explaining your approach

class myStack:
  def __init__(self):
    self.len = 0  #initializing the size of the stack
    self.stack =[] #initializing the actual stack
      
  def isEmpty(self):
    return self.len==0
      
  def push(self, item):
    self.stack.append(item) #add to the stack and increment size by 1
    self.len +=1

      
  def pop(self):
    if self.len>0:
      self.len -=1
      return self.stack.pop() #delete the last element and decrement the stack
    else:
      return -1
    
    
  def peek(self):
    if self.len >1:
      return self.stack[len-1]
    else:
      return -1
    
  def size(self):
    return len
      
  def show(self):
    for i in self.stack:
      return i
         

s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())


