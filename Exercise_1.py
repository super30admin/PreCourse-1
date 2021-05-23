from sys import maxsize
class myStack:
     def __init__(self):
         self=[]
         return self

         
     def isEmpty(self):
         return len(self)==0
         
     def push(self, item):
         self.append(item)
         print(item + "Pushed to stack")
         
     def pop(self):
         if isEmpty(self):
            return str(-maxsize-1)
         
         return self.pop()
         
        
        
     def peek(self):
         if isEmpty(self):
             return str(-maxsize-1)
         return self[len(self-1)]

        
     def size(self):
         return len(self)
         
     def show(self):
         for i in len(self):
             print(self[i])
         

s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())
