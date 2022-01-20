# Time complexity of all operations are O(1)
# space complexity of stack using array is O(n)
from sys import maxsize
class myStack:
  #Please read sample.java file before starting.
  #Kindly include Time and Space complexity at top of each file
     def __init__(self):
        self.stack = []
         
     def isEmpty(self):
        return len(self.stack) == 0
         
     def push(self, item):
        self.stack.append(item)
         
     def pop(self):
        if len(self.stack) == 0:
           return str(-maxsize - 1)
        return self.stack.pop()
        
     def peek(self):
        if self.isEmpty(self.stack):
           return str(-maxsize -1)
        return self.stack[-1]
        
     def size(self):
        return len(self.stack) -1
         
     def show(self):
        return self.stack
         

s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())

