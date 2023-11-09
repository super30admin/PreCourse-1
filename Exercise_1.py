class myStack:
  #Please read sample.java file before starting.
  #Kindly include Time and Space complexity at top of each file
  #declairing the constructor
  def __init__(self):
    self.arr = []

  #checking if string is empty
  #Time Complexity : O(1)
  #Space Complexity : O(1)     
  def isEmpty(self):
    if(len(self.arr)==0):
      return True
    else:
      return False

  #pushing element in item
  #Time Complexity : O(1)
  #Space Complexity : O(1)   
  def push(self, item):
    self.arr.append(item)

  #pop the last element
  #Time Complexity : O(1)
  #Space Complexity : O(1)     
  def pop(self):
    ele = self.arr[-1]
    del self.arr[-1]
    return ele
    
  #returning the last element
  #Time Complexity : O(1)
  #Space Complexity : O(1) 
  def peek(self):
    #If empty return 0 and print " Stack Underflow"
    if(len(self.arr)==0):
      return "Stack Underflow"
    return self.arr[-1]
  
  #returning the size
  #Time Complexity : O(1)
  #Space Complexity : O(1) 
  def size(self):
    return len(self.arr)

  #returning whole arr/stack
  #Time Complexity : O(1)
  #Space Complexity : O(1)  
  def show(self):
    return self.arr
         

s = myStack()
s.push('1')
s.push('2')
s.push('3')
print(s.pop())
print(s.show())
print(s.isEmpty())
