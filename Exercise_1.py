class myStack:
  #Please read sample.java file before starting.
  #Kindly include Time and Space complexity at top of each file
     def __init__(self,limit=100):
        self.stack=[]
        
     def isEmpty(self):
        return len(self.stack) <=0
         
     def push(self, item):
        if len(self.stack)>=self.limit:
          print("Overflow")
        else:
          self.stack.append(item)
          print("Stack after push: ",self.stack)
         
     def pop(self):
        if len(self.stack)<=0:
          print("Underflow")
        else:
          return self.stack.pop()        
        
     def peek(self):
        if len(self.stack)<=0:
          print("Underflow")
        else:
          return self.stack[-1]
        
     def size(self):
        return len(self.stack)
         
     def show(self):
        return self.stack
         

s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())
