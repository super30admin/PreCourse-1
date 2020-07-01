class myStack:

     def __init__(self):
          self.items = []
         
     def isEmpty(self):
          return self.size()==0
         
     def push(self, item):
          self.items.append(item)
         
     def pop(self):
          if (not self.isEmpty()):
               return self.items.pop()
          else:
               return "Can not pop. Stack is empty"

     def peek(self):
          if (not self.isEmpty()):
               return self.items[-1]
          else:
               return "Stack is empty"
        
     def size(self):
          return len(self.items)

     def show(self):
          return self.items

s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())
