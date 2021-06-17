class myStack:
     def __init__(self):
          """
          we use a list as a stack
          """
          self.stack = []
         
     def isEmpty(self):
          """
          Function to check if the stack is empty or not
          Takes O(1) time.
          """
          return True if not self.stack else False
         
     def push(self, item):
          """
          Function to push values in stack
          Takes O(1) time.
          """
          self.stack.append(item)
         
     def pop(self):
          """
          Function to pop values from stack
          Takes O(1) time.
          """
          return self.stack.pop()
        
        
     def peek(self):
          """
          Function to check top value of stack
          Takes O(1) time.
          """
          return self.stack[-1] if self.stack else None
     def size(self):
          """
          Function to find size of stack
          Takes O(1) time.
          """
          return len(self.stack)
         
     def show(self):
          """
          Function to print values of stack
          Takes O(n) time.
          """
          
          return self.stack
         

s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())
