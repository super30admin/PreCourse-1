'''
Time complexity : 
for push, pop is O(1) (Amortized because we use dynamic array to implement it)
Space complexity : 
as we are not using extra memory(although we are using dynamic array which grows as input) space complexity would be O(1) amortized
'''

class myStack:  
  #python constructor to initialize the list 
  def __init__(self):
    self.stack = []
  # this function checks if the stack is empty or not and returns the boolean value
  def isEmpty(self):
    if self.stack:
      return False
    else :
      return True
  # this function takes item as the input and appends top of the stack i.e end of the list
  def push(self, item):
    self.stack.append(item)

# this function removes the top item from the stack
  def pop(self):
    if not self.isEmpty():
      return self.stack.pop()
    else :
      return "Stack is empty canno't pop from it"

# this fuction returns the top item from the stack
  def peek(self):
    if not self.isEmpty():
      return self.stack[-1]
    else :
      return "stack is empty canno't peek into it"

# this function returns the size of the stack
  def size(self):
    return len(self.stack)

# this function returns the elements in the stack
  def show(self):
    return self.stack

s = myStack()
s.push('1')
s.push('2')
print(s.show())
print(s.pop())
print(s.peek())
print(s.isEmpty())
print(s.size())
print(s.show())