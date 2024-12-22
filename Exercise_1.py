# Time Complexity :
# Space Complexity :
# Did this code successfully run on Leetcode :
# Any problem you faced while coding this :
class myStack:
     def __init__(self):
          self.stack = []
         
     def isEmpty(self):
          if len(self.stack) == 0:
               return True
         
     def push(self, item):
          # adding element to array
          self.stack.append(item)
         
     def pop(self):
          if not self.isEmpty():
               return self.stack.pop()
          return None
        
     
     def peek(self):
          if not self.isEmpty():
               return self.stack[-1]
          return None
        
     def size(self):
         return len(self.stack)
     def show(self):
          return str(self.stack)
         

s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())
