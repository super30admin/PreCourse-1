class myStack:
  #Please read sample.java file before starting.
  #Kindly include Time and Space complexity at top of each file
     def __init__(self):
      self.stack=[]

     def isEmpty(self):
      return len(self.stack)==0
         
     def push(self, item):
        self.stack.insert(0,item)  

     def pop(self):
      if len(self.stack)==0:
        print("there is no element to pop")
      else:
        return self.stack.pop()
              
        
     def peek(self):
      if len(self.stack)==0:
        print("The stack is empty")
      else:
        print(self.stack[0])
        
     def size(self):
      return len(self.stack)
         
     def show(self):
      if len(self.stack)==0:
        print("The stack is empty")
      else:
        return self.stack

         

s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())

