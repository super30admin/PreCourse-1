"""
// Space Complexity : O(N) where N = number of elements in the stack
// Did this code successfully run on Leetcode : There is no LC Question. 
// Any problem you faced while coding this :
What does show operation supposed to do? Print the array, but in what order?

// Your code here along with comments explaining your approach
"""

class myStack:
  #Please read sample.java file before starting.
  #Kindly include Time and Space complexity at top of each file
     def __init__(self):
      self.arr = []
         
     def isEmpty(self):  #TC = O(1)
      return len(self.arr) == 0
         
     def push(self, item): #TC = O(1)
      self.arr.append(item)
         
     def pop(self):  #TC = O(1)
      return self.arr.pop()
        
     def peek(self):  #TC = O(1)
      return self.arr[-1]
        
     def size(self):  #TC = O(1)
      return len(self.arr)
         
     def show(self):   #TC = O(N) - because print the entire stack
      return self.arr
         

s = myStack()
s.push('1')
s.push('2')
s.push('3')
print(s.pop())
print(s.show())
