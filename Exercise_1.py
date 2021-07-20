class myStack:
     def __init__(self):
         self.stack = []
         self.size = 0

     def isEmpty(self):
          if self.size == 0:
               return True
          return False

     def push(self, item):
          self.stack.append(item)
          self.size += 1

     def pop(self):
          if self.isEmpty():
               print("Nothing in Stack")
          else:
               self.size -= 1
               return self.stack.pop()

     def peek(self):
          if self.isEmpty():
               print("Nothing in Stack")
          else:
               return self.stack[-1]

     def size(self):
          return self.size

     def show(self):
          for each in self.stack:
               print(each)


s = myStack()
print(s.stack)
print(s.show())
