# Author : Akaash Trivedi
# Time Complexity : O(1) using methods. Without using pop() its O(n)
# Space Complexity : O(n) - length of the list
# Did this code successfully run on Leetcode : Not available. Runs locally
# Any problem you faced while coding this : No

# Implement Stack using Array.
class myStack:
  #Please read sample.java file before starting.
  #Kindly include Time and Space complexity at top of each file
    def __init__(self):
      self.stack = []

    def isEmpty(self):
      return len(self.stack) == 0
      # Time Complexity: O(1)

    def push(self, item):
      self.stack.append(item)
      # Time Complexity: O(1)
 
    def pop(self):
      # without using the pop() method
      if self.isEmpty():
        return None
      else:
        item = self.stack[-1]
        self.stack = self.stack[:-1]
        return item
      # Time Complexity: O(n) 
      # if we use the pop() method, it will be O(1)
        
    def peek(self):
      if self.isEmpty():
        return None
      return self.stack[-1]
      # Time Complexity: O(1

    def size(self):
      return len(self.stack)
         
    def show(self):
      if self.isEmpty():
        return None
      return self.stack
      # Time Complexity: O(1)

s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())
