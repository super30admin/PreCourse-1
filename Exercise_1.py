class myStack:
     def __init__(self):
         # Stack as an array
         self.stack = []
         self.size = 0

     def isEmpty(self):
         if(self.size()==0):
             return True
         else:
            return False

     def push(self, item):
         self.size += 1
         self.stack.append(item)

     def pop(self):
         self.stack.pop()

     def peek(self):
         print(self.stack[self.size - 1])

     def size(self):
         return self.size

     def show(self):
         print(self.stack)


s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())
