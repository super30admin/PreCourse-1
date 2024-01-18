class myStack:
  #Please read sample.java file before starting.
  #Kindly include Time and Space complexity at top of each file

  # Time Complexity
  # push: O(1)
  # pop: O(1)
  # peek: O(1)
  # size: O(1)
  # show: O(n)

  # Space Complexity
  # Here we use a list to implement the stack so the space complexity will O(n).
  # If we consider any additional space being utilized for the operations, then
  # push: O(1)
  # pop: O(1)
  # peek: O(1)
  # show: O(1)

  def __init__(self):
    # initiaize the stack as a list
    self.stack = [] 
         
  def isEmpty(self):
    # check length of the list. If this length is greater than 0, we return false (stack is not empty) else we return True (stack is empty)
    if len(self.stack) > 0:
      return False
    else:
      return True


  def push(self, item):
    # Insert an element at top of stack, i.e. we insert the element at the end of the list.
    # Python provides an inbuilt method that inserts an element at end of the list.
    self.stack.append(item)

  def pop(self):
    # Here we take out the top element in the stack, i.e we remove the last element from the list and return it.
    # First check if the stack is empty or not. Then proceed with the pop operation. Python provides an inbuilt method of pop to remove the last element from the list.
    if not self.isEmpty():
      return self.stack.pop()
    else:
      return '0'
        
  def peek(self):
    # Return the top element on the stack. Using -1 we address the last element in a list .
    if not self.isEmpty():
      return self.stack[-1]
    
  def size(self):
    #  Return the size of the stack.
    return len(self.stack)
         
  def show(self):
    # Displays all the elements in a stack.
    print(self.stack)
         

s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())
