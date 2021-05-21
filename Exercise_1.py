class myStack:

     def __init__(self):
          self.arr = []
         
     def isEmpty(self):
         length = self.size()
         if length == 0:
              raise Exception("Array is empty")

     def push(self, item):
          self.arr.append(item)
          print(self.arr)
         
     def pop(self):
          return self.arr.pop()
        
     def peek(self):
          length = self.size()
          print(self.arr[length-1])
          return self.arr[length-1]


     def size(self):
          return len(self.arr)

     def show(self):
          return self.arr
         

s = myStack()
# s.isEmpty()
s.push('1')
s.push('2')
s.push('3')
s.push('4')
print(s.pop())
print(s.show())
# s.peek()

