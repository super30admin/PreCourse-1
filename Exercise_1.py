""" 
// Time Complexity : O(1)
// Space Complexity : Worst case O(n), Best case O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : Remembering class concepts while doing it.


// Your code here along with comments explaining your approach
Most of the functions are straight forward. In case of peek and pop, it was important
to add condition to check if the list is empty to avoid any errors.
"""
class myStack:
  #Please read sample.java file before starting.
  #Kindly include Time and Space complexity at top of each file
     def __init__(self):
      self.items = []
         
     def isEmpty(self):
      return len(self.items) == 0
         
     def push(self, item):
      self.items.append(item)
         
     def pop(self):
      if not self.isEmpty():
        return self.items.pop()
      else:
        print("Can not remove from empty list")
        
     def peek(self):
      if not self.isEmpty():
        return self.items[-1]
      else:
        print("Stack is empty")
        
     def size(self):
      return len(self.items)
         
     def show(self):
      return self.items
         

s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())