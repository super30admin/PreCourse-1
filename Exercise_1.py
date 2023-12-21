class myStack:
     #time complexity is O(1) for all functions
     #space complexity is O(n)
     def __init__(self):
          self.array = []
          self.count = 0
         
     def isEmpty(self):
          return True if self.array == [] else False
         
     def push(self, item):
          self.array += [item]
          self.count += 1
     def peek(self):
          return self.array[-1]
         
     def pop(self):
          if self.count == 0:
               return -1
          self.count -= 1
          self.array = self.array[:-1]
          return self.peek()
        
     def size(self):
          return self.count
         
     def show(self):
          return self.array
         

s = myStack()
s.push('1')
s.push('2')
print(s.peek())
print(s.size())
print(s.show())

print(s.pop())
print(s.show())
