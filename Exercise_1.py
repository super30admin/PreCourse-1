class myStack:
     def __init__(self):
          self.myStack = []
         
     def isEmpty(self):
          return len(self.myStack) == 0
         
     def push(self, item):
          self.myStack.append(item)
         
     def pop(self):
        return self.myStack.pop()
        
     def peek(self):
          if self.isEmpty():
            print("Empty stack")
          return self.myStack[-1]
        
     def size(self):
          return len(self.myStack)
         
     def show(self):
          return self.myStack
         

s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())
