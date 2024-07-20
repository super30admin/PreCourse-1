# Time Complexity : O(n) , push takes O(1),  pop takes O(1), size O(1) 
# Space Complexity : O(n)
# Any problem you faced while coding this :No

# Your code here along with comments explaining your approach
"""Initialized stack, size and max size
  push - implemented using append operation of arrays - O(1)
  pop - implemented using pop operation of arrays - O(1)
"""

class myStack:
  #Please read sample.java file before starting.
  #Kindly include Time and Space complexity at top of each file
     def __init__(self):
        self.stack = []
        self.max = 1000
        self.stack_size = 0
         
     def isEmpty(self):
        return self.size() == 0 
         
     def push(self, item):
      if self.size() < self.max:
          self.stack.append(item)
          self.stack_size += 1
      else:
        print("Stack Overflow")
         
     def pop(self):
        if not self.isEmpty():
          self.stack_size -= 1
          return self.stack.pop()
        print("Stack Underflow")
        return 0
        
     def peek(self):
        if not self.isEmpty():
          return self.stack[-1]
        
     def size(self):
        return self.stack_size
         
     def show(self):
        print(self.stack) 

         

s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())
