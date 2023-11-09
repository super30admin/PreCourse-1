class myStack:
  #Please read sample.java file before starting.
  #Kindly include Time and Space complexity at top of each file

  ## isEmpty() TC: O(1) SC:O(1)
  ## Push() TC: O(1) SC:O(1)
  ## pop() TC: O(1) SC:O(1)
  ## peek() TC: O(1) SC:O(1)
  ## size() TC: O(1) SC:O(1)
  ## show() TC: O(n) SC:O(1)

  ### Constructor for defining a empty list
  def __init__(self):
    self.listarr = []

  ### Function to verify whether the stack is empty    
  def isEmpty(self):
    if len(self.listarr) == 0:
      print(f'The stack is empty')

  ### Inserting new element to the stack    
  def push(self, item):
    self.listarr.append(item)
    print(f'Item inserted:{item}')

  ### Poping the top element from the stack    
  def pop(self):
    if len(self.listarr) ==0:
      print(f'The stack is empty and there is no element to pop')
    else:
      return self.listarr.pop()
    
  ### Displaying the top element from the stack  
  def peek(self):
    if len(self.listarr) == 0:
      print('Stack is Empty')
    else:
      top = self.listarr[-1]
      print(f'The top element of the stack is:{top}')

  ### print the size of the stack
  def size(self):
    print(f'The size of the stack is:{len(self.listarr)}')

  ### Display the elements of the stack
  def show(self):
    for i in self.listarr:
      print(i)

         

s = myStack()
s.push('1')
s.push('2')
print(s.pop())
s.show()
