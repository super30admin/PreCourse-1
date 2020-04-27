class myStack:
     def __init__(self):
         self.data=[]

     def isEmpty(self):
         if self.data==[]:
             return True
         else:
             return False

     def push(self, item):
         self.data.append(item)
     def pop(self):
         self.data.pop()

     def peek(self):
         return self.data[-1]

     def size(self):
         return len(self.data)

     def show(self):
         print(self.data)


s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())
