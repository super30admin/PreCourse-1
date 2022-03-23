# Time Complexity : O(1)
# Space Complexity : O(n)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No
class myStack:
  #Please read sample.java file before starting.
  #Kindly include Time and Space complexity at top of each file
     def __init__(self):
       #constructor to initialize the stack, using a list
       self.stack = []
         
     def isEmpty(self):
       #checks if the stack is empty by comparing with an empty list
       return self.stack == []
         
     def push(self, item):
       #adds the item to the stack using list's append method
       self.stack.append(item)
 
     def pop(self):
       #removes the last index of the stack using pop method
       if self.stack:
         return self.stack.pop()
         
     def peek(self):
       # returns the last indexed value from the stack
       return self.stack[-1]

     def size(self):
       # returns length of the stack
       return len(self.stack)
         
     def show(self):
       # returns a copy of the stack
       return self.stack
         

s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())
