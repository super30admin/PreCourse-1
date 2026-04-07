# Time Complexity : O(1) for all operations
# Space Complexity : O(n) - n is size
# Did this code successfully run on Leetcode : Ran on terminal
# Any problem you faced while coding this : NA

class myStack:
  #Please read sample.java file before starting.
  #Kindly include Time and Space complexity at top of each file
     def __init__(self):
      self.myStack=[]
         
     def isEmpty(self):
      return len(self.myStack)==0
         
     def push(self, item):
      self.myStack.append(item)
         
     def pop(self):
        if self.isEmpty():
          return "Stack is Empty"
        return self.myStack.pop()
        
     def peek(self):
        if self.isEmpty():
          return "Stack is Empty"
        return self.myStack[-1]

     def size(self):
         return len(self.myStack)
         
     def show(self):
         return self.myStack

s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())
