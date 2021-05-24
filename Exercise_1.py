class myStack:
     def __init__(self):
          self.array = []
         
     def isEmpty(self):
          if len(self.array) == 0:
               return True
          return False

     def push(self, item):
          self.array.append(item)

     def pop(self):
          self.array.pop(-1)

     def peek(self):
          if self.isEmpty():
               return None
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
