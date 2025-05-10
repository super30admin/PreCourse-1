"""
Time Complexity
#   push(item)     -> O(1)
#   pop()          -> O(1)
#   peek()         -> O(1)
#   isEmpty()      -> O(1)
#   size()         -> O(1)
#   show()         -> O(n), [n ->  number of elements in the stack]
Space Complexity : O(n)  [n -> number of elements stored in the stack]
Did this code successfully run on Leetcode :
Any problem you faced while coding this : No
"""
class myStack:
  #Please read sample.java file before starting.
  #Kindly include Time and Space complexity at top of each file
     def __init__(self):
         self.array =[]
         self.count = 0
     def isEmpty(self):
        return self.count == 0
     def push(self, item):
        self.array.append(item)
        self.count += 1
     def pop(self):
        if not self.isEmpty():
           self.count -= 1
           return self.array.pop()
        else:
           return "Stack is empty"
        
     def peek(self):
        if not self.isEmpty():
           return self.array[-1]
        else:
           return "Stack is empty"
     def size(self):
         return self.count
     def show(self):
         return self.array[:self.count]

s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())