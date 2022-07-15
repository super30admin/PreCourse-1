# Time Complexity : Time complexity is O(1) for peek, push, pop and other functions.
# Space Complexity : Space complexity is O(1) for stack functions like push, pop, peek and other functions in the exercise.
# Did this code successfully run on Leetcode : Code ran successfully. Did not check for any such problem in leetcode but in general the code ran well for all functions.
# Any problem you faced while coding this : No problems, just a little confused if I had to implement stack overflow like in C++/Java or just append naturally as Python lists takes 
#                                           care of its own size after appending. I chose to implement stack overflow in case the system size is reached.

# Your code here along with comments explaining your approach

import sys
class myStack:
  #Please read sample.java file before starting.
  #Kindly include Time and Space complexity at top of each file
     def __init__(self):
       self.stack_array = [] #Initializing the array(list) we are going to use as a stack in this exercise
     def isEmpty(self):
       if self.size() == 0:
         return 1 # We return 1 if the length of the array is 0 which means that the stack is empty
       else:
         return 0 # If the length is not 0 then the stack is not empty, so we return 0
     def push(self, item):
       if self.size() >= sys.maxsize:
         return 'Stack overflow' # In case the size of the stack has  reached the maximum it is a stack overflow condition
       self.stack_array.append(item) # Here we add the given item to the stack
     def pop(self):
       if self.isEmpty():
         return 'Stack underflow' # If the stack is empty, we can not pop an element as it is empty.
       else:
         return self.stack_array.pop(-1) # If the stack is not empty we remove the topmost item in the stack
     def peek(self):
       if self.isEmpty():
         return 'Stack underflow' # If the stack is empty, we can not show the top element as it is empty.
       else:
         return self.stack_array[-1] # If the stack is not empty we show the topmost item in the stack
     def size(self):
       return len(self.stack_array) # We return the length of the array i.e size of the stack
     def show(self):
       return self.stack_array # We return the entire array i.e stack
         

s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())
