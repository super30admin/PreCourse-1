class myStack:

   # Time complexity for :
   # push operation = O(1)
   # pop operation = O(1)
   # peek operation = O(1)

   # Space complexity = O(n)

   def __init__(self):
      self.stack = []
      self.maxSize = 1000
      # self.top = -1

   def isEmpty(self):
      return self.stack == []

   def push(self, item):
      self.stack.append(item)
      # self.top += 1

   def pop(self):
      if self.isEmpty():
         return "Stack is empty!"
      else:
         last_element = self.stack[-1]  # saving last
         del self.stack[-1]  # removing last
         # self.top = self.top - 1
         return last_element

   def peek(self):
      if self.isEmpty():
         return "Stack is empty!"
      else:
         return self.stack[-1]

   def size(self):
      return len(self.stack)

   def show(self):
      return self.stack


s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())
