class myStack:
  #Please read sample.java file before starting.
  #Kindly include Time and Space complexity at top of each file
  def __init__(self):
      self.stack = [];

  def isEmpty(self):
      return     
  def push(self, item):
      self.stack.append(item)   

  def pop(self):
    if self.stack:
      return self.stack.pop()
    else:
      return None

  def peek(self):
      if (not self.stack):
        return None
      else:
        return self.stack[0]

  def size(self):
      return len(self.stack)
  def show(self):
      return self.stack

s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())
