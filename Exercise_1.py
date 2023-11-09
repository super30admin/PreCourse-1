# Time Complexity : O(1) for isEmpty(), O(1) for push(), O(1) for pop(), O(1) for peek(), O(1) for size(), O(n) for show()
# Space Complexity : O(n)
# Did this code successfully run on Leetcode : Could not find the problem in Leetcode
# Any problem you faced while coding this : No

class myStack:
  #Please read sample.java file before starting.
  #Kindly include Time and Space complexity at top of each file
     def __init__(self):
       self.array = []
         
     def isEmpty(self):
       return len(self.array) == 0
         
     def push(self, item):
       self.array.append(item)
         
     def pop(self):
       if self.isEmpty():
         return "Error: Stack empty"
       return self.array.pop()
        
     def peek(self):
       if self.isEmpty():
         return "Error: Stack empty"
       return self.array[-1]
        
     def size(self):
       return len(self.array)
         
     def show(self):
       return self.array
         

s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())