"""
Time Complexity : O(n)
Space Complexity : O(n)
Did this code successfully run on Leetcode :
Any problem you faced while coding this : No
"""

class myStack:
  #Please read sample.java file before starting.
  #Kindly include Time and Space complexity at top of each file

     def __init__(self):
      self.myStack = []

     def isEmpty(self):
      return not self.myStack
         
     def push(self, item):
      self.myStack.append(item)
         
     def pop(self):
      if self.isEmpty():
        return None  
      return self.myStack.pop()
                
     def peek(self):
       if self.isEmpty():
         return None
       return self.myStack[-1]

     def size(self):
       return len(self.myStack)
         
     def show(self):
       return self.myStack.copy()
         

s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())
