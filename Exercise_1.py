# Implement stack using array
# Time Complexity --> O(1) for checking if stack is empty, pushing item, popping item, peeking item, and size of stack 
# Space Complexity --> O(1) for checking if stack is empty, pushing item, popping item, peeking item and size of stack
# Code ran with driver code below
# No issues coming up with this solution

class myStack:

     def __init__(self):
          self.stack = []

     def isEmpty(self):
          return True if len(self.stack) == 0 else False

     def push(self, item):
          return self.stack.append(item)

     def pop(self):
          return self.stack.pop() if self.stack else None

     def peek(self):
          return self.stack[-1] if self.stack else None

     def size(self):
          return len(self.stack)

     def show(self):
          return self.stack[::-1]


s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())

# s = myStack()
# s.push('1')
# s.push('2')
# s.push('3')
# print(s.isEmpty())
# print(s.size())
# print(s.peek())
# print(s.show())

