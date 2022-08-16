# Time Complexity : O(1) pushing and popping of elements 
# Space Complexity : O(n)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No problem faced


# Your code here along with comments explaining your approach : treating an array 
# as a stack and using last in first out approach

class myStack:
  #Please read sample.java file before starting.
  #Kindly include Time and Space complexity at top of each file
  items = []

  def __init__(self):
    self.items = []
         
  def isEmpty(self):
    print(len(self.items) == 0)
         
  def push(self, item):
    self.items.append(item)
         
  def pop(self):
    if len(self.items) == 0:
      print('Empty list')
    self.items.pop()
    print('Last item popped from the list')
        
        
  def peek(self):
    if len(self.items) == 0:
      print('Stack is Empty')
    print(self.items[len(self.items) - 1]) 
        
  def size(self):
    return len(self.items)
         
  def show(self):
    for i in self.items:
      print(i)
         

s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())
