from sys import maxsize
class myStack:
  #Please read sample.java file before starting.
  #Kindly include Time and Space complexity at top of each file
     def __init__(self):
       self.array = []
       self.size = 1000
     def isEmpty(self):
        return len(self.array) <= 0
     def push(self, item):
         if len(self.array) >= self.size:
           raise Exception('Stack overflow')
         else:
           self.array.append(item)
     def pop(self):
        if len(self.array) <=0:
          raise Exception('Stack underflow')
        else:
          return self.array.pop()
     def peek(self):
        if len(self.array) <=0:
          raise Exception('Stack underflow')
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
