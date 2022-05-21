# Time Complexity : O(1) All operations like push/pop/peek/show take constant time with array.
# Space Complexity : O(N) where N is the number of elements in stack array
# Did this code successfully run on Leetcode :
# Any problem you faced while coding this :

class myStack:
	#Please read sample.java file before starting.
	#Kindly include Time and Space complexity at top of each file
	def __init__(self):
		self.stack = []

	def isEmpty(self):
		return bool(self.stack)

	def push(self, item):
		self.stack.append(item)

	def pop(self):
		if self.stack:
			return self.stack.pop()
		else:
			raise Exception("Stack is empty")

	def peek(self):
		# Return last element which will be top of stack
		if self.stack:
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
