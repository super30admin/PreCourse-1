class myStack:
  #Please read sample.java file before starting.
  #Kindly include Time and Space complexity at top of each file
  def __init__(self):
    # _stack list takes O(n) space
    self._stack = []
    self.count = 0

  def isEmpty(self):
    # time and space O(1)
    return self.count == 0
         
  def push(self, item):
    # time and space O(1)
    self._stack.append(item)

  def pop(self):
    # time and space O(1)
    return self._stack.pop()

  def peek(self):
    # time and space O(1)
    return self._stack[-1]

  def size(self):
    # time and space O(1)
    return self.count
         
  def show(self):
    # time O(n) and space for string O(n)
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
