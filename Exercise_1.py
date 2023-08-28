class myStack:
  #Please read sample.java file before starting.
  #Kindly include Time and Space complexity at top of each file
     def __init__(self):
          self.values=[]
         
     def isEmpty(self):
          if(len(self.values)==0):
               return True
          else:
               return False
         
     def push(self, item):
          self.values.append(item)
         
     def pop(self):
          print("Popped element "+self.values.pop())
          print("Modified Stack:")
          return self.values
        
        
     def peek(self):
          print('Element at the top')
          return(self.values[-1])
        
     def size(self):
          print('Size is:')
          return(len(self.values))
         
     def show(self):
          print("Elements in Stack")
          return self.values
          
         

s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())

