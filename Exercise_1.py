"""
Time Complexity: O(1)
Space Complexity: O(n)
Code ran successfully
"""

class myStack:

  def __init__(self):
   self.stack=[]   
  def isEmpty(self):
    """
    Returns true is stack is empty
    """
    return not self.stack
         
  def push(self, item):
    self.stack.append(item)         
  def pop(self):
    """
    Pop and return the top element if stack is not empty
    """
    if  not self.stack:
      print("Stack is empty")
      return None
    else:
      return self.stack.pop()        
        
  def peek(self):
    """
    Returns the top element if the stack is not empty
    """
    if self.stack:
      return self.items[-1]
    else:
      return None
  def size(self):
    """
    returns the size of the stack
    """
    if self.stack:
      return len(self.stack)
    else:
      return None
         
  def show(self):

    """
    Return the stack if it is not empty
    """
    if not self.stack:

      print("Stack is empty")
      return None
    else:
      return self.stack
         

s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())
