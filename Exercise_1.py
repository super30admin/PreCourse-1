class myStack:
     def __init__(self):
          self.items=[]

     def isEmpty(self):
          if self.items==Null:
               return True
         
     def push(self, item):
          self.items.append(item)
         
     def pop(self):
         return self.items.pop()

     def peek(self):
          self.items.item[-1]

     def size(self):
          len(self.items)
         
     def show(self):
          for i in range(len(self.items)):
              return self.items[i]
         
s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())
