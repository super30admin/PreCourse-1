# Time Complexity of all operations: O(1)
# Space Complexity - O(n)

class myStack:
  #Please read sample.java file before starting.
  #Kindly include Time and Space complexity at top of each file
  def __init__(self):
    self.elements = list()

  def isEmpty(self):
    if len(self.elements)==0:
      return True
    else:
      return False

  def push(self, item):
    self.elements.append(item)

  def pop(self):
    self.elements.pop()
        
  def peek(self):
    return self.elements[-1]

  def size(self):
    return(len(self.elements))

  def show(self):
    return self.elements

s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())
