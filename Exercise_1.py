# Time Complexity : O(1)
# Space Complexity : O(n)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : Functions don't have any comments about what they are supposed to do

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
        if len(self.stack) != 0:
          return self.stack.pop()
        else:
            return None
        
     def peek(self):
         if len(self.stack) != 0:
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
