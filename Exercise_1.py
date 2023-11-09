class myStack:

   def __init__(self):
      self.stack = []

   # Time Complexity : O(1)
   # Space Complexity : O(1)
   def isEmpty(self):
      return self.stack == []

   # Time Complexity : O(1)
   # Space Complexity : O(1)
   def push(self, item):
      self.stack.append(item)

   # Time Complexity : O(1)
   # Space Complexity : O(1)
   def pop(self):
      if self.stack != []:
         return self.stack.pop()
      return "Stack is empty, nothing to pop"

   # Time Complexity : O(1)
   # Space Complexity : O(1)
   def peek(self):
      if self.stack != []:
         return self.stack[-1]
      return None

   # Time Complexity : O(1)
   # Space Complexity : O(1)
   def size(self):
      if self.stack != []:
         return len(self.stack)
      return "Stack is empty."

   # Time Complexity : O(N)
   # Space Complexity : O(1)
   def show(self):
      if self.stack != []:
         for i in range(len(self.stack)):
            print(self.stack[i])
      else:
         print("Stack is empty, nothing to show.")

s = myStack()
s.push('1')
s.push('2')
print(s.pop())
s.show()