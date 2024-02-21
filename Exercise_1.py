class myStack:
  # Kindly include Time and Space complexity at top of each file
  # Time complexity is O(1) and space complexity is O(N)
  def __init__(self):
    self.list = []
    self.maxsize = 1000

  def isEmpty(self):
    if self.list == []:
      return True
    else:
      return False
  
  def isFull(self):
    if len(self.list) == self.maxsize:
      return True
    else:
      return False
    
  def push(self, item):
    if self.isFull() == False:
      self.list.append(item)
    else:
     return "The stack is full"

  def pop(self):
    if self.isEmpty():
      return "The stack is empty"
    else:
      return self.list.pop()

  def peek(self):
    if self.isEmpty():
      return "There are no elements in the list"
    else:
      return self.list[len(self.list) -1]

  def size(self):
    return len(self.list)

  def show(self):
    for i in self.list:
      print(i)
         

s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())
