class myStack:
  #Please read sample.java file before starting.
  #Kindly include Time and Space complexity at top of each file
     def __init__(self):
       self.mystack = []
         
     def isEmpty(self):
       return len(self.mystack == 0)
         
     def push(self, item):
       self.mystack.append(item)
         
     def pop(self):
       return self.mystack.pop(-1)
        
        
     def peek(self):
       return self.mystack[0]
        
     def size(self):
       return len(self.mystack)
         
     def show(self):
         return self.mystack

s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())
