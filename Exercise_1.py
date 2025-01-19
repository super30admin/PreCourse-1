class myStack:
  #Please read sample.java file before starting.
  #Kindly include Time and Space complexity at top of each file
     def __init__(self):
          self.value = []
         
     def isEmpty(self):
          return len(self.value) == 0
         
     def push(self, item):
          self.value.append(item)
          
         
     def pop(self):
          if  not self.isEmpty():
              return self.value.pop()
          
          return  "Stake is empty!"
          
        
        
     def peek(self):
          if not self.isEmpty():
               return self.value[-1]
          
          return  "Stake is empty!"
          
          
        
     def size(self):
         
        return len(self.value)
     
     def show(self):
          if self.isEmpty():
               return "Sorry,there is No items in the list"
          return self.value
                       
         

s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())
