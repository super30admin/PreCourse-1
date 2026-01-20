# Time Complexity : O(1)
# Space Complexity : O(N)
# Did this code successfully run on Leetcode : Ran it locally
# Any problem you faced while coding this : Deciding the max length and adding the sanity checks


# Your code here along with comments explaining your approach
class myStack:
     def __init__(self):
        self.maxLen = 1000                    # Maximum length allowed for the stack
        self.stack = []                       # Array that will be used as stack
        self.length = 0                       # length for O(1) access to check the length

     def isEmpty(self):
          if self.length == 0:                # If the stack is empty then the length will be zero
               return True
          return False
         
     def push(self, item):
          if self.length == self.maxLen:      # If the length has reached the max allowed length then reject the push
              return "Stack is full"
          self.stack.append(item)
          self.length += 1
         
     def pop(self):
        if self.length == 0:                  # If the stack is empty then reject the pop
             return "Stack is empty!"
        
        self.length -= 1
        return self.stack.pop()
        
     def peek(self):
        if len(self.stack) == 0:              # If the stack is empty reject the peek as there is no item to peek
             return "Stack is empty!"
        return self.stack[-1]
     
     def size(self):                          # Return the size of the stack
         return self.length
         
     def show(self):                          # Return the entire stack
         return self.stack

s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())
