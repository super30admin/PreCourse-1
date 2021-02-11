class myStack:
     def __init__(self):
            
            self.mylist=[]
         
     def isEmpty(self):
        
        istrue=False
        if len(self.mylist)==0:
            istrue=True
        
        return istrue
         
     def push(self, item):
        
        self.mylist.append(item)
         
     def pop(self):
        
        return self.mylist.pop()
        
        
        
     def peek(self):
        
        return self.mylist[-1]
        
        
        
        
     def size(self):
        
        return len(self.mylist)
         
     def show(self):
        
        print(self.mylist)

          
s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())
