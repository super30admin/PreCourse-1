class myStack:
  """
  # Time Complexity : O(1) for all the methods except for show() it is O(n)
  # Space Complexity : O(n) as we have declare the array for the stack

  # Your code here along with comments explaining your approach
    1. Initialize top to -1 indicating stack is empty
    2. list in a Python is like dynamic array so no need to declare its size while initializing.
    3. In the Push method append the new item in the list and increment a top variable
    4. If top == -1 then stack is empty and return True if stack is empty otherwise return False
    5. In pop method, check if the stack is empty, if empty return 0 otherwise pop and return the topmost element in the stack.
    6. In peek method, return the topmost element
    7. In size method, return the current size of the stack
    8. In show method, traverse through the stack and display the elements present in the stack.
  """
  def __init__(self):
    self.__top = -1 
    self.__stack = []

  def isEmpty(self):
    """Check if Stack is empty"""
    return True if self.__top == -1 else False

  def push(self, item):
    """Push the new element to the stack"""
    self.__top += 1
    self.__stack.append(item)

  def pop(self):
    """If stack is not empty then pop the element from the stack"""
    if self.isEmpty():
      print("Stack is underflow")
      return 0
    else:
      self.__top -= 1
      return self.__stack.pop()  
          
  def peek(self):
    """Return the top element present in the stack"""
    if self.isEmpty():
      print("Stack is empty")
    else:
      return self.__stack[self.__top]

  def size(self):
    """Return the current size of the stack"""
    return len(self.__stack)

  def show(self):
    """Display the stack elements"""
    if self.isEmpty() == True:
      print("Stack is empty")
    else:
      for item in self.__stack:
        print(item)

s = myStack()
s.push('1')
s.push('2')
print(s.pop(), "Popped from stack")
s.show()
