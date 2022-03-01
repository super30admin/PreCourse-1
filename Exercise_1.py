# Completed
class myStack:
  #Please read sample.java file before starting.
  #Kindly include Time and Space complexity at top of each file
     def __init__(self):
         self.stack = []
         
     def isEmpty(self):
         return self.stack == []
         
     def push(self, item):
         self.stack.append(item)
         
     def pop(self):
         if not self.isEmpty():
             poppedNode = self.stack[-1]
             del(self.stack[-1])
         else:
             return("Stack is Empty")
         
     def peek(self):
         if not self.isEmpty():
             return(self.stack[-1])
         else:
             return("Stack is Empty")
        
     def size(self):
         return(len(self.stack()))
         
     def show(self):
         return(self.stack)

s = myStack()
s.push('1')
s.push('2')
s.push('3')
print(s.pop())
print(s.show())
        
  