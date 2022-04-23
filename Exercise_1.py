class myStack:
  #Please read sample.java file before starting.
  #Kindly include Time and Space complexity at top of each file
  def __init__(self,top = -1, lst=[]):
    self.top=top
    self.lst=lst

  def isEmpty(self):
    if self.top==-1:
      return -1
  
  def push(self, item):
    self.top+=1
    self.lst.append(item)
   
  def pop(self):
    if self.isEmpty()==-1:
      print("Stack is empty")
    else:
      ele=self.lst[self.top]
      self.lst.pop()
      self.top-=1
      return ele

  def peek(self):
    return self.lst[self.top]

  def size(self):
    return self.top+1

  def show(self):
    return self.lst

         
s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())
