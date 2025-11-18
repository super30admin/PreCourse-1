#Time Complexity: 
# push: O(1)
# pop: O(1)
# peek: O(1)
# isEmpty(): O(1)
# size: O(1)
# show: O(n)
#Space Complexity: for all operations O(n) where n is the number of elements
#Yes the code ran on Leetcode

class myStack:
  #Please read sample.java file before starting.
  #Kindly include Time and Space complexity at top of each file
  def __init__(self):
    """Initialize an empty stack using a Python list"""
    self.stack = []

    
  def isEmpty(self):
    """If the stack is empty return True"""
    return len(self.stack) == 0
    
  def push(self, item):
    """Add an element to the top of the stack"""
    self.stack.append(item)
    
  def pop(self):
    """Remove an element from top of element and return the top element 
    and return None if the stack is empty"""
    if self.isEmpty()==True:
      return None
    return self.stack.pop()
   

  def peek(self):
    """Return the top element of the stack without removing any element"""
    return self.stack[-1]

  def size(self):
    """Return the length of the stack"""
    return len(self.stack)
    
  def show(self):
    """Return the stack elements as a list (bottom → top)"""
    return self.stack
         
if __name__ == "__main__":
  s = myStack()
  s.push('1')
  s.push('2')
  print(s.pop())
  print(s.show())
