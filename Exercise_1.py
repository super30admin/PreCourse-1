from collections import deque

class myStack:
     def __init__(self):
         self.stack = deque()

     def isEmpty(self):
          if self.size == 0:
               return True
          return False

     def push(self, item):
          self.stack.appendleft(item)

     def pop(self):
          return self.stack.popleft()

     def peek(self):
          return self.stack[0]

     def size(self):
          return len(self.stack)

     def show(self):
          return self.stack

s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())
