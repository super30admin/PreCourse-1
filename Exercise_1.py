""" 
Time Complexity : O(1) for push and pop
Space Complexity :O(n) for maintaining a list
Did this code successfully run on Leetcode :Yes
Any problem you faced while coding this :No
"""


class myStack:
  #Please read sample.java file before starting.
  #Kindly include Time and Space complexity at top of each file
     def __init__(self):
         self.stack = []
     def isEmpty(self):
         return self.stack==[]

     def push(self, item):
         self.stack.append(item)

     def pop(self):
        if not self.isEmpty():
          lastItem = self.stack[-1]
          del self.stack[-1]
          return lastItem
        else:
          return "Stack is empty"

        
     def peek(self):
        if self.stack:
          return self.stack[-1]
        else:
          return None

     def size(self):
         return len(self.stack)

     def show(self):
         return self.stack

s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())
