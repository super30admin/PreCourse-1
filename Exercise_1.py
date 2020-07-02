class myStack:
     def __init__(self):
         self.array = []

     def isEmpty(self):
         if(not len(self.array)):
             return true

     def push(self, item):
         self.array.append(item)

     def pop(self):
         if(len(self.array) > 0):
             return self.array.pop(len(self.array)-1)


     def peek(self):
          if(len(self.array) > 0):
              return self.array[len(self.array)-1]

     def size(self):
         return len(self.array)

     def show(self):
         if(len(self.array) > 0):
             return self.array[len(self.array)-1]


s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())
