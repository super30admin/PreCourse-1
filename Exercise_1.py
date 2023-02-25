# Time Complexity : 
  # Push : O(1)
  # Pop : O(1)
  # Peek : O(1)
  # Size : O(1)
  # isEmpty : O(1)
  # Show : O(n)
# Space Complexity :
  # Push : O(1)
  # Pop : O(1)
  # Peek : O(1)
  # Size : O(1)
  # isEmpty : O(1)
  # Show : O(n)
# Did this code successfully run on Leetcode : yes on VSCODE Editor
# Any problem you faced while coding this : I couldn't decide overflow condition


# // Your code here along with comments explaining your approach

class myStack:

     def __init__(self):
      self.stack = []
         
     def isEmpty(self):
      return len(self.stack) == 0
         
     def push(self, item):
      self.stack.append(item)
         
     def pop(self):
      if (not self.isEmpty()):
        return self.stack.pop()
      return('Stack Underflow')
        
     def peek(self):
      if (not self.isEmpty()):
        return self.stack[-1]   
      return('Stack is empty')
        

     def size(self):
      return len(self.stack)
         
     def show(self):
      return self.stack
         

s = myStack()
s.push('1')
s.push('2')

print(s.pop())
print(s.show())
