# Time and Space Complexity: O(1)
class myStack:
  def __init__(self):
    self.stack = []
        
  def isEmpty(self):
    return self.stack() == 0
        
  def push(self, item):
    if item not in self.stack:
      self.stack.append(item)
      return True
    else:
      return False
        
  def pop(self):
    if len (self.stack) <= 0:
      return ("No element in the stack")
    else: 
      return self.stack.pop()
   
  def peek(self):
    return self.stack[-1]
      
  def size(self):
    return self.size()
        
  def show(self):
    for i in self.stack:
      print(i)
         

s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())
