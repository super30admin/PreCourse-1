from collections import deque

class myStack:
  #Please read sample.java file before starting.
  #Kindly include Time and Space complexity at top of each file
     def __init__(self):
        self._stack = []
         
     def isEmpty(self):
        return True if self._stack == [] else False
         
     def push(self, item):
         self._stack.append(item)

     def pop(self):
        return self._stack.pop()
        
     def peek(self):
        return self._stack[-1]
        
     def size(self):
         return None if self._stack == [] else len(self._stack)

     def show(self):
         print(self._stack)

s = myStack()


s.push('1')
s.push('2')
# s.push('3')

# print(s.size())
# print(s.peek())
# print(s.isEmpty())

# print(s.pop())
print(s.size())
