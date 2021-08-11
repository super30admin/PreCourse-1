class myStack:
     def __init__(self):
          self.arr=[]
         
     def isEmpty(self):
          print(len(self.arr))
          print(self.arr)
          if self.arr==[]:
               
               return True
          else:
               return False

         
     def push(self, item):
          self.arr.append(item)
          
         
     def pop(self):
          if self.isEmpty():
               return "stack is empty"
               
          else:
               print("popped element is")
               el=self.arr[-1]
               del self.arr[-1]
               return el
        
        
     def peek(self):
          print(self.arr[-1])
        
     def size(self):
          return len(self.arr)
         
     def show(self):
          
          print("elements of the stack are")
          print(self.arr)
         

s = myStack()
s.push('1')
s.push('2')
print(s.pop())

print(s.show())
