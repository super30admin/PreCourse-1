"""Space Complexity : O(n)
Time Complexity : O(1)"""
class myStack:
  def __init__(self):
    self.arr = []
    self.top = None
         
  def isEmpty(self):
    if len(self.arr)==0:
      return True               #returns True if the stack is empty
    else: 
      return False              #returns False if the stack is not empty

  def push(self, item):
    self.arr = [item] + self.arr    #add the item to the first position and then appends the existing list
    self.top = item                 #New item is set as the Top 
         
  def pop(self):
    if self.top is None: 
      return ("Stack is already empty")
    else:
    #First element is removed and taken into a temp var
    #If the list is not empty, then the top is set, else it is set to None.
      tempTop = self.arr.pop(0) 
      if not self.isEmpty():
        self.top = self.arr[0]
      else:
        self.top = None
      return tempTop
        
  def peek(self):
    return self.top
        
  def size(self):
    return len(self.arr)
         
  def show(self):
    return self.arr
         
s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.pop())
print(s.show())
print(s.peek())
print(s.isEmpty())
