class myStack:
  #Please read sample.java file before starting.
  #Kindly include Time and Space complexity at top of each file
     def __init__(self):
        self.stack=[]

     def isEmpty(self):
        print('Empty Stack')
        return
         
     def push(self, item):
         self.stack.append(item)

     def pop(self):
        if not self.isEmpty():
           return self.stack.pop()
        else:
           return None

     def peek(self):
        if not self.isEmpty():
           return self.stack[-1]
        else:
           return None


     def size(self):
        return len(self.stack)

     def show(self):
        return self.stack
         

s = myStack()
# s.isEmpty()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())
