class myStack:
     def __init__(self):
          self.items = []
         
     def isEmpty(self):
         return self.item == []

     def push(self, item):
          self.items.insert(0,item)
          # self.items.insert(0,item)
         
     def pop(self):
          self.items.pop(0)
        
     def peek(self):
          self.items[0]
        
     def size(self):
          return len(self.items)

     def show(self):
          return self.items
         

s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())
