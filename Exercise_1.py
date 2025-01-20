
# Time Complexity : O(1) for all operations
# Space Complexity : O(n) since we're using a list
# Did this code successfully run on Leetcode :
# Any problem you faced while coding this :


# Your code here along with comments explaining your approach
from sys import maxsize

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
      if self.isEmpty():
        return "Empty Stack"
      return self.stack.pop()
        
    def peek(self):
        if self.isEmpty:
          return "Stack empty"
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