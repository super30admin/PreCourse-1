class myStack:
     def __init__(self):
            self.s=[]
     
     def isEmpty(self):
        if self.s==[]:
            return true
        else:
            return false
        
     def push(self, item):
            self.s.append(item)
     
     def pop(self):
            self.s.pop()
        
     def peek(self):
            if self.s:
                return self.s[-1]
            else:
                return none
            
     def size(self):
            if self.s: 
                return len(self.s)
            else:
                return none
            
     def show(self):
            if self.s:
                return self.s
            else:
                print ("Nothing to show")
         

s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show()) 
