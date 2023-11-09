# Time Complexity - O(1)
# Space Complexity - O(n)

class myStack:
  #Please read sample.java file before starting.
  #Kindly include Time and Space complexity at top of each file
     def __init__(self):
          self.st=[]
         
     def isEmpty(self):
          if len(self.st)==0:
               return True
          else:
               return True
         
     def push(self, item):
          self.st.append(item)
         
     def pop(self):
          if len(self.st)>0:
               return self.st.pop()
          else:
               print("Stack Underflow")


     def peek(self):
          if len(self.st)>0:
               return self.st[-1]
          else:
               print("Stack Underflow")
               
        
     def size(self):
          return len(self.st)
         
     def show(self):
          return self.st
         

s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())