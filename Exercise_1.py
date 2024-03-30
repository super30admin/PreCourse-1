class myStack:

  # Stack is implemented using arrays
  # isEmpty : O(1) 
  # push : O(1)
  # pop : O(1)
  # peek : O(1)
  # size : O(1)
  # show : O(1)

    
     def __init__(self):
      self.stack = []

     def isEmpty(self):
      return len(self.stack) == 0

     def push(self, item):
      self.stack.append(item)

         
     def pop(self):
      if not self.isEmpty():
        return self.stack.pop()
      else:
        return IndexError('Stack is empty , Cannot Perform pop')
        
        
     def peek(self):
      if not self.isEmpty():
        return self.stack[-1]
      else:
        return IndexError("Cannot perform Peek on empty stack")

     def size(self):
      return len(self.stack)
         
     def show(self):
      return self.stack
         

s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())
