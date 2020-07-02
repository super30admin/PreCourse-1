class myStack:
    def __init__(self,limit=10):
        self.limit=limit
        self.stk=[]
          
         
    def isEmpty(self):
        return len(self.stk)<=0
         
    def push(self, item):
        if len(self.stk)>=self.limit:
            print('Stack Overflow')
        else:
            self.stk.append(item)
               
         
    def pop(self):
        if len(self.stk)<=0:
               print('Stack is UnderFlow!')
        else:
            return self.stk.pop()        
        
    def peek(self):
        if len(self.stk)<=0:
            print('Stack is UnderFlow!')
        else:
               return self.stk[-1]
          
        
    def size(self):
          return len(self.stk)
         
    def show(self):
          return self.stk[:]
        
s = myStack()
s.push('1')
s.push('2')
s.push('7')
s.push('8')
s.push('9')
print(s.pop())
print(s.show())

