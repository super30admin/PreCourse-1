class myStack:
     def __init__(self):
          self.array = []
         
     def isEmpty(self):
          if self.array == 0:
               return True
          else:
               return False      
         
     def push(self, item):
          self.array.append(item)
         
     def pop(self):
          if self.isEmpty():
               print("Cannot pop. Stack is empty")
          else:
               return self.array.pop(-1)
        
        
     def peek(self):
          if self.isEmpty():
               print("Cannot peek. Stack is empty")
          else:
               return self.array[-1]
        
     def size(self):
          return len(self.array)
         
     def show(self):
          return self.array
         

s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())
