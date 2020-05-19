class myStack:

     def __init__(self):
          self.arr = []
          self.top = -1

     def isEmpty(self):
          return self.top == -1
         
     def push(self, item):
          self.top += 1
          self.arr.append(item)

     def pop(self):
          self.top -= 1
          return self.arr.pop(self.top + 1)

     def peek(self):
          return self.arr[self.top]
        
     def size(self):
          return len(self.arr)



s = myStack()
for i in range(0, 10):
     s.push(i)
     print(s.size())
print(s.isEmpty())
print(s.pop())
print(s.peek())
print (s.pop())
