class myStack:
     def __init__(self):
         self.stack = []

     def isEmpty(self):
          if len(self.stack) == 0:
               return True
          return False

     def push(self, item):
          self.stack.append(item)

     def pop(self):
          return self.stack.pop(len(self.stack) - 1)

     def peek(self):
          return self.stack[-1]

     def size(self):
          return len(self.stack)

     def show(self):
          return self.stack

s = myStack()
s.push('1')
s.push('2')
print(s.pop())
s.push('3')
s.push('4')
print(s.pop())
s.push('5')
print(s.pop())
print(s.show())
