class myStack:
  #Please read sample.java file before starting.
  #Kindly include Time and Space complexity at top of each file
     def __init__(self):
        self.arr = []
        self.top = -1
     def isEmpty(self):
        return self.top == -1
     def push(self, item):
        self.top += 1
        self.arr.append(item)
     def pop(self):
        if self.isEmpty():
           return
        item = self.arr.pop()
        self.top -= 1
        return item
     def peek(self):
        if self.isEmpty:
           return
        return self.arr[self.top]
     def size(self):
         return self.top + 1
     def show(self):
         return self.arr

s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())
