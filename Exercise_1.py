class myStack:
     def __init__(self):
          self.arr = []
     def isEmpty(self):
          if len(self.arr) == 0:
               return True
          else:
               return False
     def push(self, item):
          self.arr.append(item)
     def pop(self):
          if len(arr) > 0:
               return self.arr.pop()
          else:
               print("Empty Stack")
        
     def peek(self):
          if len(arr) > 0:
               return self.arr[-1]
          else:
               print("Empty Stack")
     def size(self):
          return len(self.arr)
     def show(self):
          return self.arr

s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())
