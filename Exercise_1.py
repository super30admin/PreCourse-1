#time complexity is O(1) as insertion or deletation in a stack takes constant time 
#space complexity is O(1) as no extra space is required for the operations
# Did this code successfully run on Leetcode :Not available
# Any problem you faced while coding this : got little confused for def show(self) but had the correct idea

from inspect import stack

class myStack:
  #Please read sample.java file before starting.
  #Kindly include Time and Space complexity at top of each file
     def __init__(self):
      self.stack = []
         
     def isEmpty(self):
      isEmpty.self == []
         
     def push(self, item):
         self.stack.append(item)
        
     def pop(self):
         return self.stack.pop()
        
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

