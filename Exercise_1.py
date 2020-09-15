class myStack:
     def __init__(self):
         self.stackArray = []
     def isEmpty(self):
         if not self.stackArray:
           return True
     def push(self, item):
         self.stackArray.append(item)
     def pop(self):
        if self.stackArray:
          self.stackArray.pop(-1)
     def peek(self):
        if self.stackArray:
          return self.stackArray[-1]
     def size(self):
         return len(self.stackArray)
     def show(self):
         return self.stackArray
         

s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())
