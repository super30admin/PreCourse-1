class myStack:
  #Please read sample.java file before starting.
  #Kindly include Time and Space complexity at top of each file
     def __init__(self):
      self.stack=[]

     def isEmpty(self):
      if len(self.stack)==0:
        return True
      else:
        return False
         
     def push(self, item):
      self.stack.append(item)
         
     def pop(self):
      if len(self.stack)!=0:
        self.stack.pop()
      else:
        print("Stack Empty")
        
     def peek(self):
      if len(self.stack)!=0:
        print(self.stack[-1])
      else:
        print("Stack Empty")
        
     def size(self):
      if len(self.stack)!=0:
        print(len(self.stack))
      else:
        print("0")
         
     def show(self):
      print(self.stack)
         

s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())
