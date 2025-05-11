class myStack:
  #Please read sample.java file before starting.
  #Kindly include Time and Space complexity at top of each file
     def __init__(self):
          self.mystack = []
         
     def isEmpty(self):
         if len(self.mystack) == 0:
              print("The Stack is empty")
              return True
         
     def push(self, item):
          self.mystack.append(item)
          print(f"Element {item} was pushed")
         
     def pop(self):
          if self.isEmpty():
               print(f"Stack is empty")
               return
          popped_variable = self.mystack.pop()
          print(f"element {popped_variable} was removed from stack")
        
     def peek(self):
          if self.isEmpty():
               print("Stack is empty")
          print(f"{self.mystack[-1]}")
        
     def size(self):
           print(f"{len(self.mystack)}")
         
     def show(self):
         print(f"{self.mystack}")
         

s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())
