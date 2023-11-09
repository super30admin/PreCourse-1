class myStack:
  #Please read sample.java file before starting.
  #Kindly include Time and Space complexity at top of each file
     def __init__(self):
         self.stack = []
     def isEmpty(self):
         return len(self.stack) == 0
     def push(self, item):
         self.stack.append(item)
     def pop(self):
        if self.isEmpty():
            print('Stack is Empty')
        else:
            return self.stack.pop()

     def peek(self):
        if not self.isEmpty():
            return self.stack[-1]
        else:
            print('Stack is empty')
     def size(self):
         return len(self.stack)
     def show(self):
         for i in reversed(self.stack):
             print(i)


s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())
