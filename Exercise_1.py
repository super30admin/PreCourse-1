# Time Complexity - O(1) 
# Space Complexity - O(N) as we are using an extra space that is an array for implementation

class myStack:
  #Please read sample.java file before starting.
  #Kindly include Time and Space complexity at top of each file
     def __init__(self):
          self._stack = []
         
     def isEmpty(self):
          return len(self._stack) <= 0
         
     def push(self, item):
          self._stack.append(item)
         
     def pop(self):
          if len(self._stack) > 0:
               self._stack.pop()
        
     def peek(self):
          if len(self._stack) > 0:
               return self._stack[-1]
        
     def size(self):
          return len(self._stack)
         
     def show(self):
          return self._stack

s = myStack()
s.push('1')
s.push('2')
s.push('3')
print(s.pop())
print(s.show())