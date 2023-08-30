# Time Complexity : O(1) for all operations.
# Space Complexity : O(n) where n is the length of the stack. O(1) for all methods. 
# Did this code successfully run on Leetcode : NA
# Any problem you faced while coding this : NA

class myStack:
  #Please read sample.java file before starting.
  #Kindly include Time and Space complexity at top of each file
     def __init__(self):
        self.s = []
        self.count = 0
         
     def isEmpty(self):
        if self.count == 0:
            return True
         
     def push(self, item):
        self.count += 1
        self.s.append(item)
         
     def pop(self):
        if self.count == 0:
            return None
        self.count -= 1
        return self.s.pop()
        
     def peek(self):
        return self.s[-1]
        
     def size(self):
        return self.count
         
     def show(self):
        return self.s
         

s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())
