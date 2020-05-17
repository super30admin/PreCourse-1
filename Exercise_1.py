class myStack:
     def __init__(self):

     	self.array = []
     	self.top = -1
         
     def isEmpty(self):

     	return True if self.top < 0 else False

         
     def push(self, item):
     	self.array.append(item)
     	self.top += 1


         
     def pop(self):

     	if self.isEmpty() == False:

     		pop_element = self.array[self.top]

     		self.top -= 1

     		return pop_element
     
        
     def peek(self):

     	if not self.isEmpty():
     		return self.array[self.top]
        
     def size(self):

     	size = self.top + 1
     	return size
         
     def show(self):

     	return self.array[:self.top+1]


         

s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())
