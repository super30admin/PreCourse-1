# Exercise_1 : Implement Stack using Array
from time import sleep

class myStack:
  # Please read sample.java file before starting.
  # Kindly include Time and Space complexity at top of each file
     def __init__(self):
        self.stack = []
         
     def isEmpty(self):
        return len(self.stack) <= 0
         
     def push(self, item):
        self.stack.append(item)
         
     def pop(self):
        if len(self.stack) <= 0:
            raise Exception("Stack is underflow")
        return self.stack.pop()
        
     def peek(self):
        if len(self.stack) <= 0:
            raise Exception("Stack is underflow")
        return self.stack[-1]
        
     def size(self):
        return len(self.stack)
         
     def show(self):
        print(self.stack)
        for i in self.stack:
            print(i)

s = myStack()
s.push('1')
s.push('2')
s.push('6')
s.push('0')
s.push('7')
print(s.pop())
print(s.show())
print(s.size())