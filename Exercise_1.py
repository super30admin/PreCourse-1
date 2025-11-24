# Time Complexity: 
#   push: O(1)
#   pop: O(1)
#   peek: O(1)
# Space Complexity: O(n)
# Did this code successfully run on Leetcode :No
# Any problem you faced while coding this : No


# Your code here along with comments explaining your approach
# We implement a stack using a fixed-size array of MAX size.
# 'top' keeps track of the index of the last inserted element.
# When the stack is empty, top = -1.
class myStack:
  #Please read sample.java file before starting.
  #Kindly include Time and Space complexity at top of each file
     def __init__(self):
       self.stack = []
       self.stackSize = 0
        
     def isEmpty(self):
       return self.stackSize==0
         
     def push(self, item):
       self.stack.append(item)
       self.stackSize += 1
         
     def pop(self):
        if self.isEmpty():
          return None
        self.stackSize -= 1
        return self.stack.pop()
        
        
     def peek(self):
       if self.isEmpty():
         return None
       return self.stack[-1]
        
     def size(self):
       return self.stackSize
         
     def show(self):
       return self.stack
         

s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())
