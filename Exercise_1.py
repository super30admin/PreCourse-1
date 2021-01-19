#Implement Stack using Array.
class myStack:
     def __init__(self):
         self.array =[]
     def isEmpty(self):
         return len(self.array)==0
     def push(self, item):
          self.array.append(item)
     def pop(self):
          if len(self.array)==0:
               print('array is empty')
          else:
               return self.array.pop(-1)               
        
     def peek(self):
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
