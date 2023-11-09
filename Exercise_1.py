from typing import List
from xmlrpc.client import Boolean


class myStack:
  #Please read sample.java file before starting.
  #Kindly include Time and Space complexity at top of each file
     def __init__(self):
        #we have created a list which acts stack
        self.stack = []
        #This will keep the track of the index
        self.top=-1
        

     def isEmpty(self)->bool:
        if(self.top==-1):
            return True
        return False
         
     def push(self, item):
        self.stack.append(item)
        self.top+=1#Updating the self.top
        
        
         
     def pop(self)->str:
        if(self.top==-1):
            return "Stack Underflow"
        val=self.stack[self.top]    
        self.stack.pop(self.top)
        self.top-=1#Updating the self.top
        return f"The Following value: {val} has been poped"
        
     def peek(self):
        if(self.top==-1):
            print("Stack Underflow")
            return
        return self.stack[self.top]#We can also use self.stack[-1]
     
     def size(self)->int:
        return self.top+1
         
     def show(self)->list:
        return self.stack
         

s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())