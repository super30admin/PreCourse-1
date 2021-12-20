# Time Complexity : 
   # push - O(1)
   # pop - O(1)
   # isempty - O(1)
   # display - O(n)
# Space Complexity: O(n) where n is the number of elements in the list
# Did this code successfully run on Leetcode : NA
# Any problem you faced while coding this : No

# Your code here along with comments explaining your approach 

class myStack:
     def __init__(self):
        self.stack = []
     def isEmpty(self):
        return not bool(self.stack)
     def push(self, item):
        self.stack.append(item)
     def pop(self):
        if self.isEmpty():
              return None
        return self.stack.pop()
        
     def peek(self):
        return None if self.isEmpty() else self.stack[-1]
     def size(self):
        return len(self.stack)
     def show(self):
        return self.stack

s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())
