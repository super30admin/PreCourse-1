class myStack:
     def __init__(self):
          self.arr=[]
         
     def isEmpty(self):
          return self.arr==[]
         
     def push(self, item):
          self.arr.append(item)
         
     def pop(self):
          return self.arr.pop()
        
        
     def peek(self):
          return self.arr[len(self.arr)-1]
        
     def size(self):
          return len(self.arr)
         
     def show(self):
          if self.arr:
               for i in range(len(self.arr)):
                    print('Current element',self.arr[i])
         

s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())
