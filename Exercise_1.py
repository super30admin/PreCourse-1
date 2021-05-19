class EmptyStackError(Exception):
     pass

class myStack:
     def __init__(self):
          self.items= []

     def is_empty(self):
          return self.items == []

     def size(self):
          return len(self.items)

     def push(self,item):
          self.items.append(item)

     def pop(self):
          if self.is_empty():
               raise EmptyStackError("Stack is Empty")
          return self.items.pop()

     def peek(self):
          if self.is_empty():
               raise EmptyStackError("Stack is Empty")
          return self.items[-1]

     def show(self):
          print(self.items)

#driver_code

s= myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())
