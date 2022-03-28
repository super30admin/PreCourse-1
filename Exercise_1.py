# Time Complexity = O(1)
# Space Complexity = O(n)

class myStack:
  #Please read sample.java file before starting.
  #Kindly include Time and Space complexity at top of each file
    def __init__(self):
      # Initializes the stack as a list.
      self.stack = []          
        
    def isEmpty(self):
      # Checks whether the stack has any values in it or not.
      return len(self.stack) == 0
        
    def push(self, item):
      # Add values into the stack.
      return self.stack.append(item)
        
    def pop(self):
      # Remove values from the stack.
      if self.isEmpty():
        raise IndexError("The stack is empty !!!")
      return self.stack.pop()
      
    def peek(self):
      # Check the top element of the stack.
      if self.isEmpty():
        raise IndexError("The stack is empty !!!")
      print(self.stack[-1])
      
    def size(self):
      # Returns the size of the stack.
      return len(self.stack)
        
    def show(self):
      # Returns the entire stack.
      return self.stack

         

s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())
