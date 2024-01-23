class myStack:
  #Please read sample.java file before starting.
  #Kindly include Time and Space complexity at top of each file
     def __init__(self):
          # Init an inbuilt data type list to implement the stack
          self.stack = []
         
     def isEmpty(self):
         if len(self.stack == 0): return True
         else: return False

     def push(self, item):
          # Adds a new element at the top of the stack
          self.stack.append(item)
         
     def pop(self):
        # Removes and returns the top element from the stack
        return self.stack.pop()
        
     def peek(self):
         # Returns a copy of the top element in the stack
         return self.stack[-1]
        
     def size(self):
         # Returns the number of elements in the stack
         return len(self.stack)
         
     def show(self):
         # Prints the elements
         print(self.stack)
         

s = myStack()
s.push('1')
s.push('2')
s.push('4')
s.push('5')
s.push('6')
print(s.pop())
print(s.show())
