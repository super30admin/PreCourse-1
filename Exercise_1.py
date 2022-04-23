class myStack:
#Please read sample.java file before starting.
#Kindly include Time and Space complexity at top of each file

  def __init__(self):
    self.myArray = []
  
  #Time complexity: O(1)
  #Space complexity: O(1)
  def isEmpty(self):
    if len(self.myArray) == 0:
      return True
    else:
      return False

  #Time complexity: O(1)
  #Space complexity: O(1)
  def push(self, item):
    self.myArray.append(item)
    
  #Time complexity: O(1)
  #Space complexity: O(1)
  def pop(self):
    element = self.myArray.pop()
    return element

  #Time complexity: O(1)
  #Space complexity: O(1)
  def peek(self):
    return self.myArray[-1]

  #Time complexity: O(1)
  #Space complexity: O(1)
  def size(self):
    return len(self.myArray)

  #Time complexity: O(1)
  #Space complexity: O(1)  
  def show(self):
    return self.myArray
      

s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())
