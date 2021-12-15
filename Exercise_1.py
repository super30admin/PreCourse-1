'''

Time Complexity : 
  isEmpty - O(1)
  push - O(1)
  pop - O(1)
  peek - O(1)
  size - O(1)
  show - O(N)

Space Complexity : O(N) - All functions has O(1) Space Complexity

Did this code successfully run on Leetcode : Yes

Your code here along with comments explaining your approach:

Used in-built python list and its functions for purposes of stack.

'''

class myStack:
    def __init__(self):
      self.stack = list()
      self.stack_len = 0
        
    def isEmpty(self):
      return self.stack_len == 0
    
    def push(self, item):
      self.stack.append(item)
      self.stack_len += 1
      return item
        
    def pop(self):
      val = self.stack.pop()
      self.stack_len -= 1
      return val
        
    def peek(self):
      if self.isEmpty():
        return -1
      return self.stack[-1]
        
    def size(self):
      return self.stack_len
        
    def show(self):
      for idx, val in enumerate(self.stack):
        print ("Value at %s is %s") % (idx, val)
 
s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())
