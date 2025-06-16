# // Time Complexity : O(1)  { expcet show() : O(n) }
# // Space Complexity : O(n)


class myStack:
  def __init__(self):
    self.stack = []
  def isEmpty(self):
    if(len(self.stack) == 0): 
      return True
    else:
      return False
  def push(self, item):
    self.stack.append(item)
    
  def pop(self):
    temp = self.stack[-1]
    self.stack = self.stack[:-1]    
    return temp
  
  def peek(self):
    return self.stack[-1]  
   
  def size(self):
    return len(self.stack)
         
  def show(self):
    return self.stack     

s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())
