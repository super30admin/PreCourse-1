# Time Complexity : O(1)
# Space Complexity : O(1)

class myStack:
  #Please read sample.java file before starting.
  #Kindly include Time and Space complexity at top of each file
  def __init__(self):
    self.lis=[]

  def isEmpty(self):
    if len(self.lis)==0:
      return True
         
  def push(self, item):
    self.lis.append(item)
         
  def pop(self):
    return self.lis.pop()    
        
  def peek(self):
    return self.lis[len(self.lis)-1]
        
  def size(self):
    return len(self.lis)
         
  def show(self):
    print(self.lis)
         

s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())
