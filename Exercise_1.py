class myStack:
	# Time Complexity:
	#   push() -> O(1)
	#   pop()  -> O(1)
	#   peek() -> O(1)
	#   isEmpty(), size(), show() -> O(1) for checking / length, O(n) for show (to display all elements)
	# Space Complexity: O(n), where n is the number of elements in the stack
	def __init__(self):
		self.stack = []
	
	def isEmpty(self):
		return len(self.stack) == 0
		
	def push(self, item):
		self.stack.append(item)
		
	def pop(self):
		if self.isEmpty():
			return None
		self.stack.pop()
	
	def peek(self):
		if self.isEmpty:
			return None
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
