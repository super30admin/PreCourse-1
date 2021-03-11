class myStack:
     def __init__(self):

          self.stack = []

     def isEmpty(self):

          if len(self.stack) == 0:

               return True
         
     def push(self, item):

          self.stack.append(item)

     def pop(self):

          if len(self.stack) == 0:
               return "Stack is Empty"
          return  self.stack.pop()
        
     def peek(self):

          if len(self.stack) == 0:
               return "Stack is Empty"
          return self.stack[-1]

     def size(self):

          return  len(self.stack)

     def show(self):

         return self.stack

s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())
