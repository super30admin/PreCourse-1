# Time Complexity: O(1)
# Space Complexity: O(n)

class myStack:
  #Please read sample.java file before starting.
  #Kindly include Time and Space complexity at top of each file
  def __init__(self): #creating an empty stack
    self.stack = []

  def isEmpty(self): #checking if the stack is empty
    if self.stack == []:
      return True
    else:
      return False
      
  def push(self, item): #pushing items to the stack
    self.stack.append(item)
      
  def pop(self): #popping items from the stack
    return self.stack.pop()
    
  def peek(self): #looking for the element at the top of stack
    return self.stack[-1]

  def size(self): #returning the size of the list
    return len(self.stack)  

  def show(self): #returning the final stack
    return self.stack
         
s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())
