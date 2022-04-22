class myStack:
  #Please read sample.java file before starting.
  #Kindly include Time and Space complexity at top of each file
  def __init__(self):
    self.bucket = []
  def isEmpty(self):
    len(self.bucket) == 0
      
  def push(self, item):
    self.bucket.append(item)
      
  def pop(self):
    return self.bucket.pop()
    
  def peek(self):
    return self.bucket[-1]
    
  def size(self):
    return len(self.bucket)
      
  def show(self):
    return self.bucket
         

s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())
