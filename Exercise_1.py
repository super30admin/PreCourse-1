class myStack:
  #Please read sample.java file before starting.
  #Kindly include Time and Space complexity at top of each file
     def __init__(self):
          self.list1=[]
         
     def isEmpty(self):
          return len(self.list1) == 0
               
         
     def push(self, item):
         self.list1.append(item)
         
     def pop(self):
          if not self.isEmpty():
               return self.list1.pop()
          return None
        
        
     def peek(self):
          if not self.isEmpty():
               return self.list1[-1]
          return None
        
     def size(self):
          return len(self.list1)
         
     def show(self):
          return self.list1
         

s = myStack()
s.push('1')
s.push('2')
# print(s.pop())
print(s.show())
print(s.size())
