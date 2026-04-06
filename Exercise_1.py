# // Time Complexity : O(n)
# // Space Complexity : O(n)
# // Did this code successfully run on Leetcode :
# // Any problem you faced while coding this :
# used stack.push rather than stack.append. append is used to push to array in python

# // Your code here along with comments explaining your approach

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
      return self.stack.pop(-1)
          
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