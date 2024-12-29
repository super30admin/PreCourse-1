# Author: Swabhi Papneja
# Time Complexity: O(1)
# Space Complexity: O(N)

# Dis this code run successfully in Leetcode: NA
# Approach Explaination: 
# - I used a top variable pinting to the last added element in the array. 
# - Using this top element I am checking for Stack Overflow and Underflow.
# - For pushing a new element, I am incrementing the value of the index top, and then adding a the element on the new index value of top.
# - For popping the top element, I am decrementing the value of top and returning the value of the deleted element.
# - Using display function to display all the elements in the Stack.

class myStack:
  # Please read sample.java file before starting.
  # Kindly include Time and Space complexity at top of each file
     
     def __init__(self, max_size):
          self.top = -1
          self.max_size = max_size
          self.stack_list = [None] * max_size;

         
     def isEmpty(self):
          if(self.top == -1):
               return True
          return False
               

     def push(self, item):
          if(self.top == self.max_size - 1):
               # stack is full
               print("Stack Overflow")
               return False
          
          self.top = self.top + 1
          self.stack_list[self.top] = item
          return True
               
         
     def pop(self):
          if(self.isEmpty()):
               # Stack is empty
               print("Stack Underflow")
               return
          
          removedElement = self.stack_list[self.top]
          self.top = self.top - 1
          return removedElement


     def peek(self):
        if(self.isEmpty() == False):
          return self.stack_list[self.top]
        else:
             print("Stack is empty")
             return None

     def size(self):
          return self.top + 1;
         
     def show(self):
          for i in range(self.top, -1, -1):
               print(self.stack_list[i])
          
          
         

s = myStack(1000)
s.push('1')
s.push('2')
print(s.pop())
print(s.show())
