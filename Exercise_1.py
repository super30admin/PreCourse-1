'''
Time Complexity: O(1) for all operations
Space Complexity: O(n) where n is number of elements
Problems: 
'''

'''
Program to implement Stack 
using array
'''
class myStack:
  __slots__ = "my_stack"

  '''
  Function to initialize 
  the stack
  '''
  def __init__(self):
    self.my_stack = []

  '''
  Function to check
  wheather the stack
  is empty or not
  '''
  def isEmpty(self):
    return (len(self.my_stack) == 0)
  
  '''
  Function to push 
  new item to stack
  '''
  def push(self, item):
    self.my_stack.append(item)

  '''
  Function to pop
  top element from
  the stack
  '''  
  def pop(self):
    if self.isEmpty():
      return "Cannot pop from empty Stack"
    else:
      self.my_stack.pop()
      return "element Popped"

  '''
  Function to get
  top element of 
  the stack
  '''    
  def peek(self):
    if self.isEmpty():
      return "Cannot peek on empty Stack"
    else:
      return self.my_stack[self.size() - 1]

  '''
  Function to get the
  size of the stack
  '''   
  def size(self):
    return len(self.my_stack)

  '''
  Function to print
  the elements of stack
  '''
  def show(self):
    for item in self.my_stack:
      print(item)
         

s = myStack()
s.push('1')
s.push('2')
print(s.peek())
print(s.pop())
print(s.pop())
print(s.pop())
print(s.peek())
s.push('3')
s.push('1')
s.push('2')
s.show()
