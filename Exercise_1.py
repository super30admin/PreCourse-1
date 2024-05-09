# Did this code successfully run on Leetcode : Ran on VS code 
# Any problem you faced while coding this :   
# Space Complexity : O(n)

class myStack:
  #Please read sample.java file before starting.
  #Kindly include Time and Space complexity at top of each file
     def __init__(self, size = 8):
         self.stack = []
         self.size = size
         
     def isEmpty(self):
         return len(self.stack) == 0
     
     # time complexity: O(1)    
     def push(self, item):
         #Check Stack overflow
         if len(self.stack) >= self.size:
            raise Exception("Stack overflow")
         else: 
           self.stack.append(item)

    # time complexity: O(1)    
     def pop(self):
         #Check Stack Underflow
         if len(self.stack) <= 0:
            raise Exception("Stack underflow")
         else:
             return self.stack.pop() 
         
     # time complexity: O(1)    
     def peek(self):
        # Check stack empty condition 
        if len(self.stack) <= 0:
            raise Exception("Stack underflow")
        else:
             return self.stack[-1] 
             
     def size(self):
        # Check stack empty condition 
        if len(self.stack) <= 0:
            raise Exception("Stack underflow")
        return len(self.stack)

     # time complexity: O(n)    
     def show(self):
        if len(self.stack) <= 0:
            raise Exception("Stack empty")
        else:
           for i in self.stack:
               print(i)
         
s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())
