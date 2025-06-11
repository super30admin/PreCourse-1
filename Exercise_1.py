"""
#Time Complexity :
Push/Pop/Peek/Size: O(1)
Show : O(n)

#Space Complexity :
O(n), where n is the size of the stack, 
and can be a maximum of 1000

#Did this code successfully run on Leetcode :

N/A


#Any problem you faced while coding this :

  max_size wasn't mentioned as a parameter, but considering that
  an array has a fixed size, I added it here for correctness.
"""

#Your code here along with comments explaining your approach

class myStack:
  #Please read sample.java file before starting.
  #Kindly include Time and Space complexity at top of each file
     def __init__(self, max_size=1000):
          self.st = []
          self.max_size = max_size
         
     def isEmpty(self):
          return not self.st
         
     def push(self, item):
          if len(self.st) >= self.max_size:
               print("stack overflow")
               return
          self.st.append(item)
         
     def pop(self):
          if self.isEmpty():
               print("stack underflow")
               return None
          return self.st.pop()
        
        
     def peek(self):
          if self.isEmpty():
               print("stack underflow")
               return None
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
