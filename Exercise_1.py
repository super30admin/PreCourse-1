class myStack:
    
    def __init__(self):
        self.ls=[]
        
    def isEmpty(self):
        return len(self.ls)==0
         
    def push(self, item):
        self.ls.append(item)
         
    def pop(self):
        if self.isEmpty():
            return None
        return self.ls.pop()
        
    def peek(self):
        if len(self.ls)>0:
          return self.ls[-1]
        return None
        
    def size(self):
        return len(self.ls)
         
    def show(self):
        return self.ls
         

s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())
