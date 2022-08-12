class myStack:
  # Time Complexity : O(1) The time complexity for all push(), pop(), and peek() operations is O(1)
  #Space Complexity : O(n) where n is the size of the stack
  #Did this code successfully run on Leetcode : not present on leetcode
  #Any problem you faced while coding this : No
  
  #Please read sample.java file before starting.
  #Kindly include Time and Space complexity at top of each file
  def __init__(self):
    self._stack = []
       
         
  def isEmpty(self):               # this function checks if the stack is empty
    if (len(self._stack <= 0)):
      return True
    return False
         
  def push(self, item):            # after comparing the length of the stack with size this method pushes the element at the top
    if (len(self._stack) >= self.size()) :
      raise Exception("Stack Full")
    else:
      self._stack.append(item)
     
  def pop(self):                    # pops the top element after comparing the size with length of stack
    if (len(self._stack) <= 0):
      raise Exception("Stack Empty")
    else:
      return self._stack.pop()
        
        
  def peek(self):                 # displayes the top element of the stack
    if (len(self._stack) <= 0):
      raise Exception("Stack Empty")
    else:
      return self._stack[-1]
        
  def size(self): 
    return 10
         
  def show(self):                     # returns the elements of the stack
    return self._stack
         

s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())
