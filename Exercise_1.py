class myStack:
     def __init__(self):
         self.size = 10
         self.stack = [0] * self.size
         self.top = -1

     def isEmpty(self):
         return self.top==-1

     def push(self, item):
         if(self.top<self.size-1):
            self.top += 1
            self.stack[self.top] = item
         else:
             print("stack overflow")   

     def pop(self):
        if(self.isEmpty()):
            print("stack underflow")    
        else:
            item = self.stack[self.top]
            self.stack[self.top] = 0
            self.top -= 1    
        return item
        
     def peek(self):
        return self.stack[self.top]
     def size(self):
         return self.top
     def show(self):
         if(self.isEmpty()):
             print('')
         else:
             for i in range(self.top+1):
                 print(self.stack[i])    

s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())
