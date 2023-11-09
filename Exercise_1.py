#Exercise_1 : Implement Stack using Array.

#Time Complexity : push, pop and peek operator = O(1)
#Space Complexity : O(1)
#Did this code successfully run on Leetcode : Didn't find this problem on Leetcode
#Any problem you faced while coding this : No

#Your code here along with comments explaining your approach

class myStack:
  #Please read sample.java file before starting.
  #Kindly include Time and Space complexity at top of each file
  def __init__(self):
    self.stack = []  #making a new stack
      
  def isEmpty(self):
    return self.stack == []   #if stack is empty then we can just return the original stack
      
  def push(self, item):
    if self.stack:
      self.stack.append(item)     #if stack exists, then we add the item to it
      
  def pop(self):
    if self.isEmpty():        #check is stack is empty, if yes return none
      return None
    remElement = self.stack.pop()   #if not, pop the topmost item
    return remElement
    
  def peek(self):
    peekElement = self.stack[-1]    #check to see what the topmost item in the stack is
    return peekElement
    
  def size(self):
    n = len(self.stack)     #get the length of the stack
    return n
      
  def show(self):
    for i in self.stack:      #check what the remaining items in stack are
      print(i)

s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())
