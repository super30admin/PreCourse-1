class myStack:
     def __init__(self):
         self.s = []

     def isEmpty(self):
         return self.s==None

     def push(self, item):
         self.s.append(item)

     def pop(self):
        return self.s.pop() if self.s else None
        
     def peek(self):
        return self.s[-1] if self.s else None

     def size(self):
          if self.s:
               return len(self.s)
          else:
               return 0

     def show(self):
          return self.s[:]
         

s = myStack()
s.push('1')
s.push('2')
s.pop()
s.push('3')
print(s.isEmpty())
print(s.pop())
print(s.show())
