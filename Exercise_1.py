# Time Complexity : O(1)
# Space Complexity : O(n)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : 
class myStack:
  #Please read sample.java file before starting.
  #Kindly include Time and Space complexity at top of each file
     def __init__(self):
         self.s = []
         self.i = -1

     def isEmpty(self):
          return len(self.s) == 0
         
     def push(self, item):
          self.s.append(item)
          self.i += 1
         
     def pop(self):
        if self.i >= 0:
          a = self.s.pop()
          self.i -= 1
          return a
        
     def peek(self):
         return self.s[self.i]

     def size(self):
         return len(self.s)
         
     def show(self):
         for e in self.s:
             print(e)
         

s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())
