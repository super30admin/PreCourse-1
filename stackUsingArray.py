class myStack:
	def __init__(self):
		self.list1 = []
	def isEmpty(self):
		return self.list1 == []#Returns true if list is empty
	def push(self, item):
		self.list1.append(item)		
	def pop(self):
		return self.list1.pop()
	def peek(self):
		return self.list1[len(self.list1)-1]
	def size(self):
		return len(self.list1)
	def show(self):
		for i in self.list1:
			print(i, end = ' ')
			
#Driver code	
s = myStack()
s.push('1')
s.push('2')
s.push('10')
print("Peek", s.peek())
print("Size", s.size())
print("Stack before pop", s.show())
print("Poped value:", s.pop())
print("Stack after pop", s.show())