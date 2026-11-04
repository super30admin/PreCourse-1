# Time Complexity : O(1) for all operations except show, which is O(n)
#                   (push is amortized O(1) since the list occasionally resizes)
# Space Complexity : O(n), where n is the number of elements
# Did this code successfully run on Leetcode : No exact match on LeetCode
# Any problem you faced while coding this : No

# Approach: I used a Python list as the array. The end of the list is
# the top of the stack, so push (append) and pop happen at the end in
# O(1) without shifting elements. isEmpty checks the length against 0,
# and pop/peek return None on an empty stack instead of raising an error.


# Exercise_1 : Implement Stack using Array.



class myStack:
  #Please read sample.java file before starting.
  #Kindly include Time and Space complexity at top of each file
     def __init__(self):
          self.stack=[]
         
     def isEmpty(self):
         return len(self.stack) == 0
         
     def push(self, item):
          self.stack.append(item)
         
     def pop(self):
          if self.isEmpty():
               return None
          return self.stack.pop()
        
        
     def peek(self):
          if self.isEmpty():
            return None
          return self.stack[-1]
        
     def size(self):
          return len(self.stack)
         
     def show(self):
          return list(self.stack)
         

s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())

