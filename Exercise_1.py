class myStack:
#  Time Complexity : 
#    isEmpty = O(1)
#     push = O(1)
#     pop = O(1)
#     peek = O(1)
#     size = O(1)
#     show = O(1)
#  Space Complexity : O(n) where n is length of array
#  Did this code successfully run on Leetcode :
# Any problem you faced while coding this :

  #Please read sample.java file before starting.
  #Kindly include Time and Space complexity at top of each file
     def __init__(self):
          self.stackarr = []
         
     def isEmpty(self):
          return len(self.stackarr) == 0
         
     def push(self, item):
          self.stackarr.append(item)
         
     def pop(self):
         return self.stackarr.pop()
        
     def peek(self):
          return self.stackarr[-1]
        
     def size(self):
          return len(self.stackarr)
         
     def show(self):
          return self.stackarr
          
         

s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())
