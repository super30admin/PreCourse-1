# Time Complexity :
# push - O(1)
# pop - O(1)
# peek - O(1)
# size - O(1)

# Space Complexity : O(n)

# Did this code successfully run on Leetcode : Did not find corresponding problem on LeetCode
# 
# Any problem you faced while coding this :
# No instructions for handling empty stack for peel operation, chose to return -1

# Use array as underlying data structure for storing stack elements
# Use python list operation to add i.e. push elements and remove
# Use index-based access to peek and not remove elements


class myStack:
  #Please read sample.java file before starting.
  #Kindly include Time and Space complexity at top of each file
     def __init__(self):
          self.data = []
         
     def isEmpty(self):
          return len(self.data) == 0
         
     def push(self, item):
          self.data.append(item)
         
     def pop(self):
          if self.isEmpty:
               print("stack underflow")
               return 0
          return self.data.pop()
          
     def peek(self):
          if self.isEmpty:
            print("stack is empty")
            return -1
          return self.data[-1]
          
     def size(self):
         return len(self.data)
         
     def show(self):
          print(self.data)
         

s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())
