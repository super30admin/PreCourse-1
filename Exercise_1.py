"""
TC: All Functions are O(1)

SC: All functions are O(1)

"""

class myStack:
  def __init__(self):
    self.stack=[]
    self.size=10
  def isEmpty(self):
    return len(self.stack)==0
  def push(self, item):
    if len(self.stack)>=self.size:
      print("Overflow")
    else:
      self.stack.append(item)

    return self.stack
  def pop(self):
    last_ele=self.stack[-1]
    if (len(self.stack))<=0:
      print("Underflow")
    else:
      print("Removing:",last_ele)
      self.stack=self.stack[:-1]
    return self.stack
  def peek(self):
    return self.stack[-1]
  def size(self):
    print(len(self.stack))
  def show(self):
    return self.stack

s = myStack()
s.push('1')
s.push('2')
print(s.size)
print(s.pop())
print(s.show())
s.size
