# Time Complexity : O(1)
# Space Complexity : O(n)

class myStack:

   def __init__(self):
      self.stack = []

   def isEmpty(self):
       return self.stack == []

   def push(self, item):
      self.stack.append(item)

   def pop(self):
      if self.isEmpty():
         return -1
      return self.stack.pop()

   def peek(self):
      if self.isEmpty():
         return -1
      return self.stack[-1]

   def size(self):
      return len(self.stack)

   def show(self):
       return self.stack

s = myStack()
s.push('1')
s.push('2')
s.push('3')
s.push('4')
s.push('5')
print(s.peek())
print(s.pop())
print(s.pop())
print(s.pop())
print(s.pop())
print(s.pop())
print(s.peek())
print(s.pop())
print(s.show())
