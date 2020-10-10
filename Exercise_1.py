class myStack:
     def __init__(self):
         self.s=[]
     def isEmpty(self):
          return self.s==[]

     def push(self, item):
         return self.s.append(item)
     def pop(self):
        return self.s.pop()
        
     def peek(self):
        return self.s[::-1][0]
     def size(self):
         return len(self.s)
     def show(self):
         return self.s

s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())
