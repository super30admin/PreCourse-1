class myStack:
  #Please read sample.java file before starting.
  #Kindly include Time and Space complexity at top of each file
     def __init__(self):
      self.st=[]
         
     def isEmpty(self):
      return self.st==[]
         
     def push(self, item):
      self.st.appen(item)
         
     def pop(self):
      if self.st.isEmpty:
        raise EmptyStackError("Stack is Empty")
      return self.st.pop()
        
     def peek(self):
      if self.st.isEmpty:
        raise EmptyStackError("Stack is Empty")
      return self.st[-1]
        
     def size(self):
      return len(size)
         
     def show(self):
      print(self.st)
         

s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())
