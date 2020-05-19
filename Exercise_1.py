class myStack:

     def __init__(self):
          self.array = []
          self.top = -1

     #O(1) Time complexity
     def isEmpty(self):
          return self.top == -1
     #O(1) Time Complexity
     def push(self, item):
          self.array.append(item)
          self.top += 1
     #O(1) Time Complexity
     def pop(self):
          if not self.isEmpty():
               element = self.array.pop(self.top)
               self.top -= 1
               return element
     #O(1) Time Complexity
     def peek(self):
          if not self.isEmpty():
               return self.array[self.size() - 1]
     #O(1) Time Complexity
     def size(self):
          return self.top + 1
     #O(1) Time Complexity
     def show(self):
          return self.array


s = myStack()
s.push('1')
s.push('2')
s.push('3')
s.push('4')
s.push('5')
print(s.pop())
print(s.show())
print(s.peek())
print(s.isEmpty())