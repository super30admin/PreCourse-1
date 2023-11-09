# Time Complexity: O(1)
#Space Complexity: O(n)
from inspect import stack

class myStack:
  #Please read sample.java file before starting.
  #Kindly include Time and Space complexity at top of each file
     def __init__(self):
      self.stack = []
         
     def isEmpty(self):
      return self.stack == []
         
     def push(self, item):
      if item not in self.stack:
        self.stack.append(item)
        return True
      else:
        return False
         
     def pop(self):
       if(not self.isEmpty()):
            lastElement = self.stack[-1] #Save the last element to return
            del(self.stack[-1]) #Remove the last element
            return lastElement
       else:
            return("Stack Already Empty")
                
     def peek(self):
      return self.stack[-1]
        
     def size(self):
      return self.size
         
     def show(self):
       print(self.stack)

         

s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())
