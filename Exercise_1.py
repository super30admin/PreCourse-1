"""
Time Complexity:

Push Operation : O(1)
Pop Operation : O(1)
Peek : O(1)
Check if Empty : O(1)
Check Size : O(1)
Display Stack : O(n) - n is the number of elements in the stack

Space Complexity : O(n) — n is the number of elements in the stack
"""
class myStack:
  #Please read sample.java file before starting.
  #Kindly include Time and Space complexity at top of each file
  def __init__(self):
    self.stack = []
      
  def isEmpty(self):
    if len(self.stack) == 0:
      return True
    else:
      return False
      
  def push(self, item):
    self.stack.append(item)
      
  def pop(self):
    if self.isEmpty():
      return "Stack is Empty"
    else:
      return self.stack.pop()
    
  def peek(self):
    if self.isEmpty():
      return "Stack is Empty"
    else:
      top_element = self.stack[-1]
      return top_element
    
  def size(self):
    return len(self.stack)
      
  def show(self):
    return self.stack
         

s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())
