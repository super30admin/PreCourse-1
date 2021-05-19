
class myStack:
     def __init__(self):
     	self.stk = []
         
     def isEmpty(self):
     	return len(self.stk)
         
     def push(self, item):
         self.stk.append(item)
     def pop(self):
     	if len(self.stk)<=0:
     		return 0
     	else:
     		return self.stk.pop()
        
        
     def peek(self):
     	if len(self.stk <= 0):
     		print("Stack Underflow")
     		return 0
     	else:
     		return self.stk[-1]
        
     def size(self):
     	return len(self.stk)
         
     def show(self):
     	print(self.stk)
         

s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())
