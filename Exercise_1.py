class myStack:
  #Please read sample.java file before starting.
  #Kindly include Time and Space complexity at top of each file
  def __init__(self):
    self._stack = []
    self.count = 0

  def isEmpty(self):
    return self.count == 0
         
  def push(self, item):
    self._stack.append(item)

  def pop(self):
    return self._stack.pop()

  def peek(self):
    return self._stack[-1]

  def size(self):
    return self.count
         
  def show(self):
    stack = ' '.join(reversed(self._stack))
    return f"[{stack}]"

s = myStack()
s.push('1')
s.push('2')
s.push('3')
s.push('4')
s.push('5')
print(s.pop())
print(s.show())
