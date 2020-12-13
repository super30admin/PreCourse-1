class myStack:
     def __init__(self):
          self.stack = []
         
     def isEmpty(self):
          return True if self.size() == 0 else False
         
     def push(self, item):
          return self.stack.append(item)
         
     def pop(self):
          if self.isEmpty():
             print("Stack Underflow")
             return 0
          else:
               return self.stack.pop()
        
     def peek(self):
          return self.stack[-1]

     def size(self):
          return len(self.stack)

     def show(self):
          return '[TOP] ' + ' -> '.join(self.stack[::-1])
         

s = myStack()
s.push('1')
s.push('2')
s.push('3')
print(s.pop())
print(s.show())