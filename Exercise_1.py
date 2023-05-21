
# Time Complexity : O(1) for all operations
# Space Complexity : O(n) where n is the size of stack itself.
# Did this code successfully run on Leetcode : -
# Any problem you faced while coding this : Could not really find the exact problem on leetcode.

# Used a basic array and a counter in order to make all operations optimal

class myStack:
  #Please read sample.java file before starting.
  #Kindly include Time and Space complexity at top of each file
     def __init__(self):
      self.stack = []
      self.count = 0
         
     def isEmpty(self):
      return self.count == 0
         
     def push(self, item):
      self.stack.append(item)
      self.count += 1
         
     def pop(self):
      if not (self.count):
        raise Exception("Cannot pop from empty stack")
      self.count -= 1
      return self.stack.pop()
      
     def peek(self):
      return self.stack[self.count-1]
        
     def size(self):
      return self.count
         
     def show(self):
      return self.stack
         

s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())
