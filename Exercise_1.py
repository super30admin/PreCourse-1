class myStack:
  #Please read sample.java file before starting.
  #Kindly include Time and Space complexity at top of each file

  #Time Complexity: O(1) for push, pop, peek, isEmpty, isFull, size, and show operations
  #Space Complexity: O(n) where n is the capacity of the stack
  
  # Things to keep in mind: Since we are providing the stack with a fixed capacity, the len of the stack will always be equal to the capaity.
  #                         The size of the stack will be accurately provided by the top pointer since it represents the logical fill level.
  #                         So it is necessary to use the top pointer to determine the size of the stack instead of using len(self.stack) which will always return the capacity of the stack.

     def __init__(self,capacity):
          self.capacity = capacity
          self.stack = [None] * self.capacity
          self.top = -1
         
     def isEmpty(self):
         return self.top == -1

     def isFull(self):
         return self.top == self.capacity - 1

     def push(self, item):
          if self.top == self.capacity -1:
               print("stack overflow")
          else:
               self.top += 1
               self.stack[self.top] = item
         
     def pop(self):
          if self.top == -1:
               print("stack is empty")
          else:
               item = self.stack[self.top]
               self.stack[self.top] = None
               self.top -= 1
               return item
        
        
     def peek(self):
          if not self.isEmpty():
                return self.stack[self.top]
        
     def size(self):
         return self.top + 1
     
     def show(self):
         return self.stack[:self.top+1]

s = myStack(2)
s.push('1')
s.push('2')
print(s.pop())
print(s.size())
print(s.show())
