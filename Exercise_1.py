class myStack:
  #Please read sample.java file before starting.
  #Kindly include Time and Space complexity at top of each file
  def __init__(self):
    self.items = []
      
  def isEmpty(self):
    return len(self.items) == 0
      
  def push(self, item):
    self.items.append(item)
    
  def pop(self):
    if self.isEmpty() == False:
        return self.items.pop()
    else:
      print("Empty Stack")
    
  def peek(self):
    if self.isEmpty() == False:
        return self.items[-1]
    else:
      print("Empty Stack")
    
  def size(self):
    return len(self.items)
      
  def show(self):
    return self.items

s = myStack()
s.push('1')

s.push('2')
print(s.pop())
print(s.show())
