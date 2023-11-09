#Time Complexity : O(1)
#Space Complexity : O(1)
#Did this code successfully run on Leetcode : Yes
#Any problem you faced while coding this : No


class myStack:
  #Please read sample.java file before starting.
  #Kindly include Time and Space complexity at top of each file
  def __init__(self):
    self.data = []
  def isEmpty(self): #check the stack is empty or
    return len(self.data) == 0    

  def push(self, item): #append the element at top of the stack
    self.data.append(item)

  def pop(self): #remove the top element from the stack
    if self.isEmpty():
      return "Stack is Empty"
    return self.data.pop()
        
  def peek(self): #look for the top element of the stack
    if self.isEmpty():
      return "Stack is Empty"
    return self.data[-1]

  def size(self): #lenghth of the stack
    return len(self.data)
         
  def show(self):
    return self.data

s = myStack()
s.push(1)
s.push(2)
print(s.pop())
print(s.show())
