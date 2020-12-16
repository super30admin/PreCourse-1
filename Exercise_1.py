#Exercise_1 : Implement Stack using Array.


class myStack:
     def __init__(self):
         self.stack = []
     def isEmpty(self):
          if not self.stack:
               return True 
          return False
     #O(1)
     def push(self, item):
         self.stack.append(item)

     #O(1)
     def pop(self):
        if self.stack:
             self.stack.pop()
        else: 
             return -1
     #O(1)
     def peek(self):
          if self.stack:
               return self.stack[-1]
          else:
               return -1

     def size(self):
         return len(self.stack)

     def show(self):
         print(self.stack)

s = myStack()
s.push('1')
s.push('2')
print(s.show())
print(s.pop())
print(s.show())
