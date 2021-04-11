class myStack:
     def __init__(self):
         self.stack=[]
     def isEmpty(self):
         if len(stack) == 0:
              return True
         return False
     def push(self, item):
         self.stack.append(item)

     def pop(self):
         if len(self.stack) == 0:
              return -1
         return self.stack.pop()

     def peek(self):
         if len(self.stack)!= 0:
              return self.stack[-1]
         else:
              return -1

     def size(self):
         return len(stack)
     def show(self):
          print(self.stack)
         

s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())
