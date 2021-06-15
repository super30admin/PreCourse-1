class myStack:

     array = []
     
     def __init__(self):
          self.array =[]
         
     def isEmpty(self):
          return len(self.array) == 0
         
     def push(self, item):
          max_value = 100
          if len(self.array) >= max_value:
               print("Stack Overflow")
          else:
               self.array.append(item)
               print("Pushed ", item)

         
     def pop(self):
          if self.isEmpty():
               print("Stack Underflow")
          else:
               return self.array.pop()
        
        
     def peek(self):
          if self.isEmpty():
               print("Stack Underflow")
          else:
               return self.array[-1]
        
     def size(self):
          return len(self.array)
         
     def show(self):
          return len(self.array)
         

s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())
print(s.peek())
