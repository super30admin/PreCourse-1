# Time Complexity : O(1)
# Space Complexity : O(n)
# Did this code successfully run on Leetcode :
# Any problem you faced while coding this :
'''
None
'''

class myStack:
  #Please read sample.java file before starting.
  #Kindly include Time and Space complexity at top of each file
     def __init__(self):
        self.stack = []
         
     def isEmpty(self):
         return len(elf.stack) == 0
         
     def push(self, item):
         self.stack.append(item)
         
     def pop(self):
        if not self.isEmpty():
          self.stack.pop()
        else:
          print("Stack is empty !!!")
  
     def peek(self):
        if not self.isEmpty():
          return self.stack[-1]
        else:
          print("Stack is empty !!!")
        
     def size(self):
        return len(self.stack)
         
     def show(self):
        return self.stack
         

s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())
