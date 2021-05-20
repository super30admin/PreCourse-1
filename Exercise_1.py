import numpy as np
class myStack:

     def __init__(self):
          self.top=0
          self.s=np.array([])


         
     def isEmpty(self):
               if self.top==-1:
                return True

         
     def push(self, item):

               self.top+=1
               self.s[self.top]=item




         
     def pop(self):
          if (not self.isEmpty( )):
               temp=self.s[self.top]
               self.top-=1
               return temp
          else:
              print("stack is empty")


        
        
     def peek(self):

         return self.s[self.top]
        
     def size(self):
         return self.top+1
         


         

s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.peek())
