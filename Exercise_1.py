class myStack:
     def __init__(self):
     	self.stack = []
         
     def isEmpty(self):
     	if not self.stack:
     		return True
     	return False
         
     def push(self, item):
     	self.stack.append(item)

     def pop(self):
     	if self.isEmpty():
     		print("Stack underflow")
     	else:
	        return self.stack.pop()
        
     def peek(self):
     	return self.stack[-1]
        
     def size(self):
     	return len(self.stack)
         
     def show(self):
     	return self.stack
         

s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())
