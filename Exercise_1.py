# Time complexity: O(1)
# Space complexity: O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No 


class myStack:
  #Please read sample.java file before starting.
  #Kindly include Time and Space complexity at top of each file
     def __init__(self):
         self.stack = []
     def isEmpty(self):
       return self.stack == []

     def push(self, item):
       self.stack.append(item)
         
     def pop(self):
        return self.stack.pop() 
        
     def peek(self):
       return self.stack[self.size() - 1]
        
     def size(self):
       return len(self.stack())
         
     def show(self):
       return [item for item in self.stack]
         

s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())
