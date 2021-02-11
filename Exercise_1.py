class myStack:
     def __init__(self):
         self.items= []

     def isEmpty(self):
         return len(self.items) ==0
     
     def push(self, item):
         self.items.append(item)
         
     def pop(self):
          if self.isEmpty():
               return ("Empty stack")
          else:
              return self.items.pop()
        
     def peek(self):
          return self.items[len(self.items)-1]
        
     def size(self):
         return len(self.items)

     def show(self):
          if self.isEmpty():
               return ("Nothing to show")
          else:
              i = 0
              for i in self.items:
                  return (i)

s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())
