class myStack:
   # Please read sample.java file before starting.
   # Kindly include Time and Space complexity at top of each file
   def __init__(self):
      self.stack = []
      self.maxSize = 1000

   def isEmpty(self):
      return len(self.stack) < self.maxSize

   def push(self, item):
      if self.isEmpty():
         self.stack.append(item)
      # else:
      #    print("Not Possible to Add value to the Stack")
      #    return False
      # return True

   def pop(self):
      if self.size() > 0:
         currTop = self.stack.pop()
         print("Removed Element", currTop)
         # return True
      # else:
      #    print("Not Possible to Pop elements")
      #    return False

   def peek(self):
      if self.size() > 0:
         return self.stack[-1]
      # else:
      #    print("Stack is Empty")
      #    return False

   def size(self):
      return len(self.stack)

   def show(self):
      for i in range(self.size()-1, -1, -1):
         print(self.stack[i])

s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())
