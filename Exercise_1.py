# Time Complexity :  

#  Push : O(1)
#  Pop  : O(1)


# Space Complexity :  O(1)

class myStack:
  #Please read sample.java file before starting.
  #Kindly include Time and Space complexity at top of each file
  
  
  def __init__(self):
    
    # initialized top = -1 and arr to have None and size as 10 
    self.length=10
    self.arr=[None]*self.length
    self.top=-1

         
  def isEmpty(self):

  # if top is at -1, then stack is empty
    if self.top == -1:
      return True
    else:
      return False

         
  def push(self, item): 
 
    # increment top and add the new element at the top index


    if self.top == self.length-1:
      return "Stack Overflow"
    else:
      self.top=self.top+1
      self.arr[self.top]=item
         
  def pop(self):

    #decrement top, remove the top element return the element at (top) index
    if self.isEmpty() == True:
      return "Stack Underflow"
    else:
      popItem=self.arr[self.top]
      self.top=self.top-1
      return popItem

        
  def peek(self):


    if self.isEmpty() == True:
      return "Stack Underflow"

    # return the top element
    return self.arr[self.top]
        
  
  def size(self):

    # size will be equal to top+1
    if self.isEmpty() == True:
      return "Stack Underflow"
    
    return self.top+1
         
  def show(self):

    # return the complete array
    stack_arr= [ element for element in self.arr if element is not None]
    count =0
    curr_stack=[]
    while count<=self.top:
      curr_stack.append(stack_arr[count])
      count=count+1
    return curr_stack
             

s = myStack()
s.push('1')
s.push('2')
s.push('3')
print(s.pop())
print(s.show())

print(s.peek())
print(s.size())
print(s.isEmpty())
print(s.pop())
print(s.isEmpty())