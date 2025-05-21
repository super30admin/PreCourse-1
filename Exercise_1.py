# Time Complexity : O(1)
# Space Complexity :  O(n)
# Did this code successfully run on Leetcode : I did not run it on Leetcode
# Any problem you faced while coding this : No


# Your code here along with comments explaining your approach

class myStack:
  #Please read sample.java file before starting.
  #Kindly include Time and Space complexity at top of each file
  #Initialized empty array
     def __init__(self):
      self.stack=[]
      self.max=1000
  #To check if stack is empty       
     def isEmpty(self):
        return len(self.stack)==0
  #Push the element to the stack (LIFO)
     def push(self, item):
      if (len(self.stack)==max):
            return 'Stack is full'
      else :
        self.stack.append(item)
        return item
  #Pop the last element from the stack
     def pop(self):
      if len(self.stack)==0:
          return 'Stack is empty'
      else:
        self.stack.pop()
  # Can only read last element of the stack
     def peek(self):
        if len(self.stack)==0:
            return 'Stack is empty'
        else:
          return self.stack[-1]
  #Return the size of the stack
     def size(self):
         return len(self.stack)
  #Return the stack
     def show(self):
         return self.stack

s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())

