from queue import Empty


class myStack:
  def __init__(self):
    self.stack = []
    

  def isEmpty(self):
    if self.stack is Empty:
      return True
         
  def push(self, item):
    self.stack.append(item)
    

         
  def pop(self):
    return self.stack.pop()


  def peek(self):
    print(self.stack[-1])
        
  def size(self):
    return len(self.stack)
         
  def show(self):
    return self.stack
         
  #Please read sample.java file before starting.
  #Kindly include Time and Space complexity at top of each file
     

s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())
