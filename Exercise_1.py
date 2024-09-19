class myStack:
  #Please read sample.java file before starting.
  #Kindly include Time and Space complexity at top of each file
  # Time Complexity : O(1)
  # Space Complexity : O(1)
  # Did this code successfully run on Leetcode : No 
  # Any problem you faced while coding this : No 
  
     def __init__(self):
      self.s1 =[]

     def isEmpty(self):\
      return len(self.s1) == 0

     def push(self, item):
      self.s1.append(item)

     def pop(self):
      if not self.isEmpty:
        self.s1.pop()
      else:
        return 0

     def peek(self):
      if not self.isEmpty():
        return self.s1[-1]
      else:
        return 0
        
     def size(self):
       return len(self.s1)
         
     def show(self):
       return self.s1
         

s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())
print(s.size())
