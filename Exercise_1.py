from ctypes import sizeof
from logging import raiseExceptions


class myStack:
  #Please read sample.java file before starting.
  #Kindly include Time and Space complexity at top of each file
     def __init__(self):
       self.elements=[]
         
     def isEmpty(self):
       return self.elements==[]
         
     def push(self, item):
         self.elements.append(item)

     def pop(self):
        if self.isEmpty():
          print("Stack is Empty")
        return self.elements.pop()
        
     def peek(self):
       if self.isEmpty():
          print("Stack is Empty")
       return self.elements[len(self.elements)-1]
        
     def size(self):
       return len(self.elements)
         
     def show(self):
       for i in self.element:
        print(i)
         

s = myStack()
s.push('1')
s.push('2')
print("Length: ",len(s))
print("Top Element: ",s.peek())
print(s.pop())
print("Is-Empty: ",s.isEmpty())
print(s.show())
