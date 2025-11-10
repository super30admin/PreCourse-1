
# Time Complexity : O(1)
# Space Complexity : O(n)
# Did this code successfully run on Leetcode : Yes on Geeksforgeeks
# Any problem you faced while coding this : No

# // Your code here along with comments explaining your approach

class myStack:
  #Please read sample.java file before starting.
  #Kindly include Time and Space complexity at top of each file
     def __init__(self):
          self.stacklist = []

# // Time Complexity : O(1)
# // Space Complexity :          
     def isEmpty(self):
          return not self.stacklist

# // Time Complexity : O(1)
# // Space Complexity : O(n)           
     def push(self, item):
          self.stacklist.append(item)

# // Time Complexity : O(1)
# // Space Complexity :                 
     def pop(self):
          return self.stacklist.pop()

# // Time Complexity : O(1)
# // Space Complexity :           
     def peek(self):
          return self.stacklist[-1]

# // Time Complexity : O(1)
# // Space Complexity :           
     def size(self):
          return len(self.stacklist)

# // Time Complexity : O(1)
# // Space Complexity :         
     def show(self):
          return self.stacklist
         

s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())
