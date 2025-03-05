class myStack:
  #Please read sample.java file before starting.
  #Kindly include Time and Space complexity at top of each file
  
     def __init__(self):   
         #Initializing an empty stack
         # Time Complexity: O(1)
         # Space Complexity : O(1)
         self.stack =[]

     def isEmpty(self):   
          # Returns true if stack is empty else false 
          # Time Complexity: O(1)
          # Space Complexity : O(1)
          return len(self.stack) == 0
               
     def push(self, item):
          # append the item into the stack
          # Time Complexity: O(1)
          # Space Complexity : O(1)
          self.stack.append(item)
         
     def pop(self):
          # If stack is not empty, remove and return the top element
          # Time Complexity: O(1)
          # Space Complexity : O(1)
          if not self.isEmpty():
               return  self.stack.pop()
          # returns none if stack is empty
          return None
         
     def peek(self):
          # If stack is not empty, return the top element without removing
          # Time Complexity: O(1)
          # Space Complexity : O(1)
          if not self.isEmpty():
               return self.stack[-1]
          # returns none if stack is empty
          return None       
        
     def size(self):
          #retuns size of the stack
          # Time Complexity: O(1)
          # Space Complexity : O(1)
          return len(self.stack)
         
     def show(self):
          #returns all the elements in the stack
          # Time Complexity: O(N)
          # Space Complexity : O(N)
          return self.stack[:]
         
s = myStack()
print(s.isEmpty())
print(s.peek())
s.push('1')
s.push('2')
s.push('3')
print(s.isEmpty())
print(s.size())
print(s.show())
print(s.peek())
print(s.pop())
print(s.show())