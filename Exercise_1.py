class myStack:
     def __init__(self):
          self.stack = list()
          self.maxSize = 10
          self.top = 0
         
     def isEmpty(self):
          return self.top <= 0
         
     def push(self, item):
          if self.top >= self.maxSize:
               print('Stack is Full.',item, ' cannot be pushed.')
               return -1
          self.stack.append(item)
          self.top += 1
          print(item, ' pushed to stack')
          return item
         
     def pop(self):
          if self.isEmpty():
               return 'Stack is Empty'
          item = self.stack.pop()
          self.top -= 1
          return item
        
        
     def peek(self):
          if self.isEmpty():
               return 'Stack is Empty'
          return self.stack[self.top-1]
        
     def size(self):
          return self.top
         
     def show(self):
          return self.stack[::-1]
        

s = myStack()
s.push('1')
s.push('2')
s.push('3')
s.push('4')
s.push('5')
print(s.show())
print(s.pop())
print(s.peek())
print(s.show())
print(s.pop())
print(s.show())


