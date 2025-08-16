class myStack:
  #Please read sample.java file before starting.
  
#  Time Complexity : O(1) for push(), pop(), peek(), isEmpty(), size(). O(N) for show() method.
#  Space Complexity : O(N) where N is number of elements in stack.

     def __init__(self):
      self.stack = []
         
     def isEmpty(self):
      return self.stack == []
         
     def push(self, item):
      self.stack.append(item)
         
     def pop(self):
      if not self.isEmpty():
          return self.stack.pop()
      else:
          return "Stack is empty"
          
     def peek(self):
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
