class myStack:
  #Please read sample.java file before starting.
  #Kindly include Time and Space complexity at top of each file
     def __init__(self):
      self.stack = []
         
     def isEmpty(self):
      return len(self.stack) == 0
      "Time complexity - O(1)"
      "Space complexity - O(1)"
         
     def push(self, item):
      self.stack.append(item)
      "Time complexity - O(1)"
      "Space complexity - O(1)"
         
     def pop(self):
      if self.isEmpty():
        return None
      else:
        return self.stack.pop()
      "Time complexity - O(1)"
      "Space complexity - O(1)"
        
     def peek(self):
      if self.isEmpty():
        return None
      else:
        return self.stack[-1]
      "Time complexity - O(1)"
      "Space complexity - O(1)"
        
     def size(self):
      return len(self.stack)
      "Time complexity - O(1)"
      "Space complexity - O(1)"
         
     def show(self):
      return self.stack
    "Time complexity - O(n)"
    "Space complexity - O(n)"
         

s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())
