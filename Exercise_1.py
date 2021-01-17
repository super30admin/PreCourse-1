class myStack:
     def __init__(self):
          self.items = []
         
     def isEmpty(self):
          return self.items == []
         
     def push(self, item):
          self.items.append(item)

     def pop(self):
          return self.items.pop()
        
     def peek(self):
          return self.items[len(self.items) - 1]
        
     def size(self):
          return len(self.items)
         
     def show(self):
          showArray = ""
          for i in self.items:
               showArray = showArray + i + ' '
          return showArray

s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())
