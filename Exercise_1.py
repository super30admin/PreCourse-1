class myStack:
  #Please read sample.java file before starting.
  #Kindly include Time and Space complexity at top of each file
  def __init__(self):
      self.list = []

  def isEmpty(self):
    return len(self.list) == 0

  def push(self, item):
    self.list.append(item)

  def pop(self):
    return self.list.pop()
    
  def peek(self):
    return self.list[-1]

  def size(self):
    return len(self.list)
      
  def show(self):
    for idx, item in enumerate(self.list[::-1]): print(f"{item} -> ", end="") if idx != (len(self.list)-1) else print(item)

s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())