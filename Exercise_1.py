#  Time Complexity : 
#   - pop() => Constant time as removing the last element O(1)
#   - isEmpty() => O(1) as checks if the list is empty or not based on the length of the list.
#   - push() = > O(1) as appending to the end of the list.
#   - peek() => O(1) as constant time to detch the last element.
#   - size() => O(1) as determins the length of the list. 
#  Space Complexity : Length of the list(n) => O(n)
#  Did this code successfully run on Leetcode : Yes
#  Any problem you faced while coding this : No


class myStack:
  def __init__(self):
    self.stack = []
         
  def isEmpty(self):
    if(len(self.stack) == 0): # check stack length to determine if the stack is empty or not.
      return True
    return False
         
  def push(self, item):
    self.stack.append(item) # append item to the end of the list.
      
  def pop(self):
    if(len(self.stack) == 0):
      return "List is Empty. pop() operation cannot be executed"
    return self.stack.pop(-1) # Remove the last appended element.
 
  def peek(self):
    return self.stack[-1] # Return s the last appened item in the list.
      
  def size(self):
    return len(self.stack) # Returns the length of the list.
  
  def show(self):
    return self.stack  

s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())
