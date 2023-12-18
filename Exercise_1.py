# // Time Complexity : O(1) for push,pop,peek,size and show
# // Space Complexity : O(n) since we are using an array to store elements
# // Did this code successfully run on Leetcode : NA
# // Any problem you faced while coding this : None
class myStack:
  #Please read sample.java file before starting.
  #Kindly include Time and Space complexity at top of each file
     def __init__(self):
          self.stackArr = []
          self.size = 0       
     def isEmpty(self):
          if not self.stackArr:
               return True
          
     def push(self, item):
          self.stackArr.append(item)
          self.size += 1

     def pop(self):
          if not self.isEmpty():
               self.stackArr.pop()
               self.size -= 1
        
     def peek(self):
          return self.stackArr[-1]
        
     def size(self):
          return self.size
         
     def show(self):
          return self.stackArr
          
         

s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())
