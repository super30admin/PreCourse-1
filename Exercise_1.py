# Time Complexity: push/pop/peek/isEmpty/size -> O(1); show -> O(n)
# Space Complexity: O(n), where n is the number of items stored

class myStack:
  #Please read sample.java file before starting.
  #Kindly include Time and Space complexity at top of each file
  def __init__(self):
    self._data = []

  def isEmpty(self):
    return len(self._data) == 0

  def push(self, item):
    self._data.append(item)

  def pop(self):
    if not self._data:
      return None
    return self._data.pop()

  def peek(self):
    if not self._data:
      return None
    return self._data[-1]

  def size(self):
    return len(self._data)

  def show(self):
    return list(self._data)

s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())
