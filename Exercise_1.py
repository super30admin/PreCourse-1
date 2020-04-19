class myStack:
     def __init__(self):
         self.stack=list()
         self.maxSize=8
#          self.top=0
        
     def isEmpty(self):
        if len(self.stack)==0:
            return True
        return False
    
     def push(self, item):
            if len(self.stack)>=self.maxSize:
                return ("Stack full!")
            self.stack.append(item)
#             self.top+=1
            return True
         
     def pop(self):
        if not self.isEmpty():
                
#         if self.top<=0:
#             return ("Stack Empty!")
            item = self.stack.pop()
#         self.top -= 1
        return item
    
     def peek(self):
        return self.stack[-1]
    
     def size(self):
        return len(self.stack)
         
     def show(self):
         return self.stack

s = myStack()
s.push('1')
s.push('2')
s.push('5')
s.pop()
 print(s.pop())
print(s.show())
