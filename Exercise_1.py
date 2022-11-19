class myStack:
  #Please read sample.java file before starting.
  #Kindly include Time and Space complexity at top of each file
# // Time Complexity : O(1)
# // Space Complexity : O(1)
# // Did this code successfully run on Leetcode : Yes
# // Any problem you faced while coding this : No
     def __init__(self):
      self.st = []
         
     def isEmpty(self):
      return self.st
         
     def push(self, item):
      self.st.append(item)
         
     def pop(self):
      val = self.st.pop()
      return val
        
        
     def peek(self):
      if self.st:
        return self.st[-1]
        
     def size(self):
      return len(self.st)
         
     def show(self):
      return self.st
         

s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())
