#Time complexity: O(1)
#Space complexity: O(n)

class myStack:
  #Please read sample.java file before starting.
  #Kindly include Time and Space complexity at top of each file
  data = [] # create an array
  def __init__(self):
    pass
  
  def isEmpty(self):
    if not self.data: # if the array is empty return True else false
      return True
    return False

  def push(self, item):
    self.data.append(item) # append the item in an array and return it
    return self.data

  def pop(self):
    if self.data: # if there is element in array delete the last element else none
      del self.data[-1]
    else:
      return None
        
  def peek(self): # return the last element or the top element
    return self.data[-1]

  def size(self): # length of the array
    return len(self.data)

  def show(self): # return the array to print it
    return self.data     

s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())
print(s.isEmpty())