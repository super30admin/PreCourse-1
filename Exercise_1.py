
class myStack:
  #Please read sample.java file before starting.
  #Kindly include Time and Space complexity at top of each file
     def __init__(self):
         self._Stack=[]
         
     def isEmpty(self):
    
        return(len(self._Stack)<=0)
        
        
         
     def push(self, item):
         self._Stack.append(item)
         
         
     def pop(self):
         return(self._Stack.pop())
        
        
     def peek(self):
         return self._Stack[-1]
        
     def size(self):
         return(len(self._Stack))
         
     def show(self):
         k=[]
         for i in range(len(self._Stack)-1, -1, -1):
            k.append(self._Stack[i])
            print(k)
             
            
            
             
      
  
    
       
         

s = myStack()
s.push('1')
s.push('2')

print(s.pop())
print(s.peek())

print(s.show())

