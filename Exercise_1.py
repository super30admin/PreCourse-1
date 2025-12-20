# Time Complexity : O(1) ; All stack operation perform in constant time
# Space Complexity : O(n); n = number of elements in the stack
# Did this code successfully run on Leetcode : - 
# Any problem you faced while coding this : No

# Your code here along with comments explaining your approach

class myStack:
  def __init__(self):
    self.stack=[]
         
  def isEmpty(self):  #checking if stack is Empty
    return False if self.stack else True
         
  def push(self, item):
    self.stack.append(item)
         
  def pop(self):
    if self.isEmpty():
      print("Stack is empty; Cannot pop")
    else:
      return self.stack.pop() #remove and return the top element
        
  def peek(self):
    if self.isEmpty():
      print("Stack is empty; Cannot peek")
    else:
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


