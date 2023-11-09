#Time Complexity : O(1)
#Space Complexity : O(n)
#Did this code successfully run on Leetcode :
#Any problem you faced while coding this :

class myStack:
  #Please read sample.java file before starting.
  #Kindly include Time and Space complexity at top of each file
     def __init__(self):
       self.stack = []
       self.stack_length = 0
       self.top = -1

     def isEmpty(self):
       if self.top == -1:
         return True

     def push(self, item):
       self.stack.append(item)
       self.stack_length += 1

     def pop(self):
       if self.stack_length == 0:
         return -1
       else:
         self.top -= 1
         self.stack_length -= 1
         popped_element = self.stack.pop(-1)
         return popped_element

        
 
     def peek(self):
       return self.stack[self.top]
        
     def size(self):
         return self.stack_length
       
     def show(self):
         return self.stack

s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())
