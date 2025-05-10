class myStack:
  #Please read sample.java file before starting.
  #Kindly include Time and Space complexity at top of each file
     def __init__(self):
          self.st=[]
          self.tp=-1
         
     def isEmpty(self):
          return 0==len(self.st)
         
     def push(self, item):
          self.st.append(item)
          
         
     def pop(self):
          if len(self.st)==0:return 0
          return len(self.st)
        
        
     def peek(self):
          return self.st[-1]
        
     def size(self):
          return len(self.st)
         
     def show(self):
          print(self.st)
         

s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())

