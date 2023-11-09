
class myStack:
  #Please read sample.java file before starting.
  #Kindly include Time and Space complexity at top of each file
     def __init__(self):
         self.s=[]

         
     def isEmpty(self):
         return self.s==[]

         
     def push(self, item):
         self.s.append(item)
           
         
     def pop(self):
         if self.isEmpty():
             return ' '
         lastEle=self.s[-1]
         del(self.s[-1])
         
         return lastEle
        
        
     def peek(self):
         return self.s[-1]
        
     def size(self):
         return len(self.s)
 
         
     def show(self):
         return self.s

         
         

s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())
