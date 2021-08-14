class myStack:
  #Please read sample.java file before starting.
  #Kindly include Time and Space complexity at top of each file
     def __init__(self):
          self.values = [] * 10
          self.size = 0
          self.top = self.size - 1

     def isEmpty(self):
         return self.size == 0

     def push(self, item):
          if len(self.values) == 0 | self.size <= len(self.values):
               self.values.insert(self.top + 1, item)
               self.top = self.top + 1
               self.size = self.size + 1
          else:
               print(len(self.values))
               print(self.size)
               print("stack overflow")
               
     def pop(self):
          if self.size == 0:
               print("stack underflow")
          else:
               item = self.values[self.top]
               self.top = self.top - 1;
               self.size = self.size - 1;
               return item
        
     def peek(self):
         pass
     def size(self):
          return self.size

     def show(self):
         pass 

s = myStack()
s.push('1')
s.push('2')
s.push('3')
s.push('4')
s.push('5')
s.push('6')
s.push('7')
s.push('8')
s.push('9')
s.push('10')
s.push('11')
print(s.pop())
# print(s.show())
