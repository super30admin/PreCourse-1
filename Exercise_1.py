class myStack:
     def __init__(self):
         self.stack = []
         return

     def isEmpty(self):
          if len(self.stack)==0:
               return True
          else:
               return False

     def push(self, item):
          self.stack.append(item)

         
     def pop(self):
          if len(self.stack)==0:
               return -1
          return self.stack.pop()
        
     def peek(self):
          top = len(self.stack)-1
          return self.stack[top]
        
     def size(self):
          return len(self.stack)
         
     def show(self):
          return self.stack

         

s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())
