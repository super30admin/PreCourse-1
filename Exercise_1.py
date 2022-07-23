"""
Time Complexity : O(1) for all operations except, show(), it takes O(n),
n is the number of elements in the stack
Space Complexity : O(n)
Did this code successfully run on Leetcode : could not find it on leetcode
Any problem you faced while coding this : No


Your code here along with comments explaining your approach

"""

class myStack:

  def __init__(self):
      """
      create an empty stack
      """
      self.data = []
    
  def push(self, d):
      """
      Add an element to the  top of the stack
      """
      self.data.append(d)
      
  def pop_s(self):
      """
      pop the  element from the top of the stack
      """
      if self.is_empty():
          raise IndexError('stack is empty')
          
      else:
          return self.data.pop()
      
  def peek(self):
      """
      return the top element of the stack
      """
      if self.is_empty():
          raise IndexError('stack is empty')
      else:
          return self.data[-1]
      
  def is_empty(self):
      """
      returns a boolean, checks if the stack is empty or not
      """
      return len(self.data) == 0

  def size(self):
      """
      return length of the stack
      """
      return len(self.data)

  def show(self):
      """
      display the elements of the stack
      """
      if self.is_empty():
          raise IndexError('stack is empty')
      
      for i in range(len(self.data)):
          print(self.data[i], end = " ")
      print(" ")
          
        

s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())
