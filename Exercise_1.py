class myStack:
  #Please read sample.java file before starting.
  #Kindly include Time and Space complexity at top of each file
  def __init__(self):
    #Time Complexity - O(1)
    #Space Complexity - O(1)
    self.bucket = []

  def isEmpty(self):
    #Time Complexity - O(1)
    #Space Complexity - O(1)
    len(self.bucket) == 0
      
  def push(self, item):
    #Time Complexity - O(1)
    #Space Complexity - O(1)
    self.bucket.append(item)
      
  def pop(self):
    #Time Complexity - O(1)
    #Space Complexity - O(1)
    return self.bucket.pop()
    
  def peek(self):
    #Time Complexity - O(1)
    #Space Complexity - O(1)
    return self.bucket[-1]
    
  def size(self):
    #Time Complexity - O(1)
    #Space Complexity - O(1)
    return len(self.bucket)
      
  def show(self):
    #Time Complexity - O(1)
    #Space Complexity - O(1)
    return self.bucket
         

s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())
