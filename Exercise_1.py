class myStack:
     def __init__(self):
         self.stack = []

     def isEmpty(self):

     	 if self.stack is None:
         	return True
         else:
         	return False

     def push(self, item):
     	self.stack.append(item)
         
     def pop(self):
         return self.stack.pop()
        
     def peek(self):
         return self.stack[len(self.stack)-1]
        
     def size(self):
     	return len(self.stack)
         
     def show(self):
     	return self.stack


         

s = myStack()
s.push('1')
s.push('2')
#s.push('3')
#print(s.isEmpty())
#print(s.size())
print(s.pop())
#print(s.peek())
print(s.show())
