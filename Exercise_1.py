class myStack:
     def __init__(self):
          self.stack = list()
         
     def isEmpty(self):
          return len(self.stack) == 0
         
     def push(self, item):
         self.stack.append(item)

     def pop(self):
          return self.stack.pop()
        
     def peek(self):
         return self.stack[-1]
     def size(self):
          return len(self.stack)
         
     def show(self):
          result = ' '.join([str(element) for element in self.stack])
          return result
         
s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())
