'''
// Time Complexity :O(1)
// Space Complexity :O(n)
// Did this code successfully run on Leetcode : did not find the question
// Any problem you faced while coding this : No
'''

class myStack:
  #Please read sample.java file before starting.
  #Kindly include Time and Space complexity at top of each file
  def __init__(self):
     #initialize array
      self.arr = []

  def isEmpty(self):
     #check the lenght of array if it is 0
    if len(self.arr) == 0:
      return True
    else:
      return False
  
  def push(self, item):
     #adding/push item into array/stack using append
    self.arr.append(item)
         
  def pop(self):
     # removing/pop item from stack
    self.arr.pop()
        
  def peek(self):
   # this will get the last element of stack
    self.arr[-1]
        
  def size(self):
     #get the size of stack
    return len(self.arr)
         
  def show(self):
     # print stack
    return self.arr
         

s = myStack()
s.push('1')
s.push('2')
print(s.show())
print(s.pop())
print(s.show())
s.push('3')
print(s.show())
print(s.peek())
print(s.size())
print(s.show())
