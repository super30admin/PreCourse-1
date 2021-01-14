class myStack:
  def __init__(self):
    # initially the stack is empty
    self.stack = []

  def push(self, item):
    # append the item to the stack
    return self.stack.append(item)

  def size(self):
    # return the length of the stack
    return len(self.stack)

  def peek(self):
    # if the size of stack is 0 then return 0
    if self.size() is 0:
      return 0
    # if the stack is not empty then return last element in the list
    return self.stack[-1]
  # check if the stack is empty
  def isEmpty(self):
    # if the size of the stack is 0 then return True else return False
    if self.size() is 0:
      return True
    return False

  def show(self):
    # if the stack is empty then return empty list
    if self.size() is 0:
      return []
    # else return the list
    return self.stack

  def pop(self):
    # return False if the stack is empty
    r = self.isEmpty()
    # if the stack is not empty then remove the last element in the list using pop
    if r:
      return None
    return self.stack.pop()

if __name__ == '__main__':
  s = myStack()
  s.push('1')
  s.push('2')
  print(s.pop())
  print(s.show())