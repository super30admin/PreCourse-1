class myStack:
  #Please read sample.java file before starting.
  #Kindly include Time and Space complexity at top of each file
     def __init__(self):
        self.stack = []

         
     def isEmpty(self):
        if len(self.stack) == 0:
           return self.stack

     def push(self, item):
         return self.stack.append(item)
     def pop(self):
        return self.stack.pop()

     def peek(self):
        return self.stack[len(self.stack) -1]
        
     def size(self):
        return len(self.stack)
         
     def show(self):
        for i in range(len(self.stack)):
           return self.stack[i]

s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())
