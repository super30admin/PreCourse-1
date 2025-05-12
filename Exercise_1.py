# Time Complexity : O(1)
# Space Complexity : O(n)
# Did this code successfully run on Leetcode : Couldn't find this problem on Leetcode
# Any problem you faced while coding this : No

class myStack:
  #Please read sample.java file before starting.
  #Kindly include Time and Space complexity at top of each file
     def __init__(self):
          self.stack = []  # Initialize empty list to store stack elements
     def isEmpty(self):
          return len(self.stack) == 0  # Return True if stack is empty
     def push(self, item):
          self.stack.append(item)  # Add item to the top of the stack
     def pop(self):
          if self.isEmpty():
               return None  # Return None if stack is empty
          return self.stack.pop()  # Remove and return the top element
     def peek(self):
          if self.isEmpty():
               return None  # Return None if stack is empty
          return self.stack[-1]  # Return the top element without removing it
     def size(self):
          return len(self.stack)  # Return the number of elements in the stack
     def show(self):
          return self.stack  # Return the entire stack as a list

s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())
