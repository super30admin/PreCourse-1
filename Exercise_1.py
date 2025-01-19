#   Time Complexity : 
#   Space Complexity :
#   Did this code successfully run on Leetcode : 
#   Any problem you faced while coding this :
class myStack:
  #Please read sample.java file before starting.
  #Kindly include Time and Space complexity at top of each file
     def __init__(self):
         self.arr =[]
     def isEmpty(self):
          return len(self.arr) == 0
    # O(1)
     def push(self, item):
        self.arr.append(item)
    # O(1)
     def pop(self):
        if not self.isEmpty():
            return self.arr.pop()
        else:
            return "Stack underflow"
     # O(1)   
     def peek(self):
          if not self.isEmpty():
            return self.arr[-1]
          else:
              return "Empty stack"
             
    #O(1)    
     def size(self):
         return len(self.arr)
    # O(1)    
     def show(self):
         return self.arr
         

s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())
