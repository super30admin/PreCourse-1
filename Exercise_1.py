class myStack:
  #Please read sample.java file before starting.
  # Time = O(N) and Space O(len of array) complexity 
  # push and pop = O(1)

     def __init__(self):
     	self.list =[]
         
     def isEmpty(self):
     	if len(self.list) == 0:
     		return True
     	else:
     		return False
         
     def push(self, item):
     	self.list.append(item)
         
     def pop(self):
     	if self.isEmpty():
     		return -1
     	else:
     		self.list = self.list[:-1]
     		return self.list
        
        
     def peek(self):
     	if self.isEmpty():
     		return -1
     	else:
     		return self.list[:-1]
        
     def size(self):
     	return len(self.list)
         
     def show(self):
     	return self.list
         

s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())
