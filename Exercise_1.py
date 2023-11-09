class myStack:
  #Please read sample.java file before starting.
  #Kindly include Time and Space complexity at top of each file
     def __init__(self):
          self.list = []
         
     def isEmpty(self):
          if self.list == []:
               return True
          else:
               return False
         
     def push(self, item):
          self.list.append(item)
          return "The element has been successfully inserted"
         
     def pop(self):
          if self.isEmpty():
               return "There is not any element in the stack"
          else:
               return self.list.pop()
        
        
     def peek(self):
          if self.isEmpty():
               return "There is not any element in the stack"
          else:
               return self.list[len(self.list) - 1]
        
     def size(self):
          return len(self.list)
         
     def show(self):
          return self.list

         

s = myStack()
s.push('1')
s.push('2')
s.push('3')
s.push('4')
s.push('5')
print(s.pop())
print(s.show())
