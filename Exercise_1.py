#Assuming implement stack using array, here array means python list
class myStack:
     def __init__(self):
          self.array = []
          self.top = -1
         
     def isEmpty(self):
          if self.top == -1:
               return True
     #runtime complexity O(1)
         
     def push(self, item):
          self.top += 1
          self.array.append(item)
     #runtime complexity O(1)
         
     def pop(self):
          if not self.isEmpty():
               result = self.array[self.top]
               self.top -= 1
               return result
          else:
               return "Underflow"
     #runtime complexity O(1)
             
        
     def peek(self):
          if not self.isEmpty():
               return self.array[self.top]
          else:
               return "Underflow"
     #runtime complexity O(1)

     def size(self):
         return self.top + 1
     #runtime complexity O(1)

     def show(self):
          return list(reversed(self.array[0: self.top+1]))
     #runtime complexity O(n)
          
          


s = myStack()
s.push('1')
s.push('2')
print(s.peek())
print(s.show())
print(s.size())
print(s.pop())
print(s.size())
print(s.show())
