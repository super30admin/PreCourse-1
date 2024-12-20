class myStack:

    def __init__(self):
       # Initializing an empty list to represent the stack
       self.st = []
    
    def isEmpty(self):
       # Checks if the stack is empty and returns True if it is, otherwise False.
       return len(self.st) == 0
          
    
    def push(self, item):
       # Adds an element on top of stack
       self.st.append(item)
         
    def pop(self):
       # Removes and returns the top item of stack if stack is not empty otherwise it returns None
       if not self.isEmpty():
          return self.st.pop()
       else:
          print("empty stack")
          return None
        
        
    def peek(self):
       # Returns the top element of array if stack is not empty or None.
       if self.isEmpty():
          return None
       return self.st[-1]
        
    def size(self):
       # Returns the number of items present in stack
       return len(self.st)
         
    def show(self):
         # Returns list of items in stack.
         return self.st

s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())

# Time complexity for each operation: O(1)
# Space complexity: O(n)