class myStack:
  #Please read sample.java file before starting.
  #Kindly include Time and Space complexity at top of each file

  '''
  Time complexity:
  isEmpty -> O(1)
  push -> O(1)
  pop -> O(1)
  peek -> O(1)
  size -> O(1)
  show -> O(n) Since all the elements in the array need to be returned

  Space complexity:
  The space complexity of the stack involves creating and managing an array of 'n' elements. So it is a O(n)

  Did this code run on Leetcode: Yes

  Any problem you faced while coding this : No problems faced

  '''

  def __init__(self):
    self.stack = []            # initialising the stack
    
         
  def isEmpty(self):
    l = len(self.stack)                    # checking the length of the array and returning True/False based on it
    if l == 0:
      return True
    else:
      return False
         
  def push(self, item):                        # Operation to add element to the Stack
    self.stack.append(item)
         
  def pop(self):                              # Operation to pop the Last-in-First-out element
    if not self.isEmpty():
      self.stack.pop()
    else:
      return 'Stack is empty'
        
  def peek(self):                              # Operation to view the element on top of the stack
    if not self.isEmpty():
      self.stack.pop()
    else:
      return 'Stack is empty'    
        
  def size(self):                            # Returning the length of the stack
    return len(self.stack)
         
  def show(self):                              # Returning the whole stack
    return self.stack
         
s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())