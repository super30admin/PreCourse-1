class myStack:
  #Please read sample.java file before starting.
  #Kindly include Time and Space complexity at top of each file

  """
  Time Complexity: 
  Push: O(1)
  Pop: O(1)
  Peek: O(1)
  isEmpty: O(1)
  size: O(1)
  show: O(N) as we return the whole list. We can return the whole list, but better practise to return a copy to avoid mutations. 

  Space Complexity: 
    O(n): Storing elements in the stack
    
    
  """
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
      print("Can't pop from empty stack")
      
    
    return self.stack.pop()
    
  def peek(self):
    if self.isEmpty():
      print("Cant peek from empty stack")
    
    return self.stack[-1]
  def size(self):
    return len(self.stack)
  def show(self):
    return list(self.stack)
         

s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())
