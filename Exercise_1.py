class myStack:
  #Please read sample.java file before starting.
  #Kindly include Time and Space complexity at top of each file
  def __init__(self):
    self.array =[]  #creating an empty array
         
  def isEmpty(self):  #The funciton will return true if the array is empty otherwise it'll return false
    if len(self.array)==0:  
      return True
    else:
      return False
         
  def push(self, item):
    return self.array.append(item)  #Appending an item to an array
         
  def pop(self):
    if not self.array.isEmpty():
      return self.array.pop()   #Poping the last element of the array if the array is not empty
    else:
      return None
        
  def peek(self):   #used to check the last elememt added in the stack
    if not self.isEmpty(): #if the array is not empty it'll return the last added element else will return none
      return self.array[-1]
    else:
      return None
        
  def size(self):     #It'll return the current length of an array.
    return len(self.array)
  
  def show(self):   #It will be used for printing the array.
    return(self.array)
         

s = myStack()
s.push('1')
s.push('2')
print(s.peek())
print(s.pop())
print(s.show())
print(s.isEmpty())