class myStack:
  #Please read sample.java file before starting.
  #Kindly include Time and Space complexity at top of each file
  #Time Complexity: Push - O(1), Pop - O(1), Peek - O(1), isEmpty - O(1), size - O(1), show - O(n)
  #Space Complexity: Push - O(1), Pop - O(1), Peek - O(1), isEmpty - O(1), size - O(1), show - O(1)

  MAX = 1000
  
  def __init__(self):
    # self.top = -1  In python, stacks can be implemented without top variable, can also use it if asked to  
    self.stackArr = []
      
  def isEmpty(self):
    return len(self.stackArr) == 0
      
  def push(self, item):
    if len(self.stackArr) == myStack.MAX:
      print('Stack Overflow')
    else:
      self.stackArr.append(item)
      print(f'Element {item} successfully appended')
      
  def pop(self):
    if len(self.stackArr):
      return self.stackArr.pop()
    else: 
      print(' Stack Underflow')
      return 0 
    
    
  def peek(self):
    if len(self.stackArr):
      return self.stackArr[-1]
    else:
      print('Stack is Empty')
      return -1
    
  def size(self):
    return len(self.stackArr)
      
  def show(self):
    print(f'Stack is as follows {self.stackArr}')
         

s = myStack()
s.push('1')
s.push('2')
print(f'{s.pop()} popped from stack')
s.show()
