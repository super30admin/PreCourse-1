class myStack:
     def __init__(self):
         self.items = []
     def isEmpty(self):
         if self.items == []:
             return True
         else:
             return False
     def push(self, item):
         self.items.append(item)
     def pop(self):
         return self.items.pop()
     def peek(self):
        return self.items[len(self.items) - 1]
     def size(self):
         return len(self.items)
     def show(self):
         return self.items

s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())
