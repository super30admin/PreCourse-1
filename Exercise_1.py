class myStack:
     MAXSIZE = 1000
     def __init__(self):
          # initialize an array with maxsize (Assuming it's a fixed size array)
          self.array = [-1]*(self.MAXSIZE)
          self.size = 0

     def isEmpty(self):
          return self.size == 0

     def push(self, item):
          self.size += 1
          self.array[self.size-1] = item

     def pop(self):
          if self.size == 0:
               raise IndexError('Cannot pop from empty stack')
          item = self.array[self.size-1]
          del self.array[self.size]
          self.size -= 1
          return item

     def peek(self):
          return self.array[self.size-1]

     def size(self):
          return self.size

     def show(self):
          return self.array[:self.size]


s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())