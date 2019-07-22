class Stack:
	MAX = 1000
	def __init__(self):
		self.a = []
		self.top = -1

	def isEmpty(self):
		if len(self.a) == 0:
			return True
		else:
			return False

	def push(self, x):
		if len(self.a) == Stack.MAX:
			print("Stack Overflow")
			return False
		else:
			self.a.append(x)
			self.top += 1
			return True

	def pop(self):
		if self.isEmpty():
			print("Stack Underflow")
			return 0
		else:
			temp = self.a[self.top]
			del self.a[self.top]
			self.top -= 1
			return temp

	def peek(self):
		if self.isEmpty():
			print("Stack Undeflow")
			return 0
		else:
			return self.a[self.top]

if __name__=="__main__":
	s = Stack()
	print(s.pop(), "Popped from stack")
	s.push(10)
	s.push(20)
	s.push(30)
	print(s.pop(), "Popped from stack")