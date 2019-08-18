class myStack:
     def __init__(self):
          self.array = []
         
     def isEmpty(self):
          if self.array == []:
               return True
          else:
               return False
         
     def push(self, item):
          self.array.append(item)
         
     def pop(self):
          return self.array.pop()
        
        
     def peek(self):
          return self.array[len(self.array)-1]
        
     def size(self):
          return len(self.array)
         
     def show(self):
          show = []
          for i in range(len(self.array)):
               show.append(self.array[i])
          return show
         

s = myStack()
s.push('1')
s.push('2')
s.push('3')
s.push('4')
print(s.pop())
print(s.show())
print(s.isEmpty())
print(s.size())
print(s.peek())

