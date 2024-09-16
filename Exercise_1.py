#Space Complexity: O(n)
#Time Complexity: O(1)
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
               return "There is no element in the stack"
          else:
               return self.list.pop()
        
        
     def peek(self):
          if self.isEmpty():
               return "There is no element in the stack"
          else:
               return self.list[len(self.list) - 1]
        
     def size(self):
          if self.isEmpty():
               return 0
          else:
               return len(self.list)
          
         
     def show(self):
          return self.list
         

s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())
