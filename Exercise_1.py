class myStack:
     def __init__(self):
          self.array = []
         
     def isEmpty(self):
          return True if not self.array else False
         
     def push(self, item):
          self.array.append(item)
         
     def pop(self):
          return self.array.pop()

     def peek(self):
          return self.array[-1]
        
     def size(self):
          return len(self.array)
         
     def show(self):
          return self.array

s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())
