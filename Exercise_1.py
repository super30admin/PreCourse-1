# Time Complexity - O(1)
# Space Complexity - O(n)

class myStack:
	def __init__(self):
		self.stack = []
	# This method will check if the stack is empty
	def isEmpty(self):
		return len(self.stack) == 0
	# This methods will help append the items on top of the list
	def push(self, x):
		self.stack.append(x)
    # This method will help pop the items from the stack starting from top
	def pop(self):
		if(not self.isEmpty()):
			y = self.stack[-1]
			self.stack.remove(y)
			return y
    # This method will show the peeked item i.e., the top item in the stack
	def peek(self):
		return self.stack[-1]
    # This method will show the size/length of the stack
	def size(self):
		return len(self.stack)
    # This method will show the stack with the items
	def show(self):
		return self.stack


s = myStack()
s.push(1)  # Pushing each item to the stack
s.push(2)   
s.push(4)
s.push(7)
s.push(100)
print("The original stack is", s.show())
print("Length of this stack is", s.size())
print("An item is removed from the stack -", s.pop())
print("Peeked item is", s.peek())
print("The current stack is", s.show())
print("The stack is empty -", s.isEmpty())
print("An item is removed from the stack -", s.pop())
print("An item is removed from the stack -", s.pop())
print("An item is removed from the stack -", s.pop())
print("An item is removed from the stack -", s.pop())
print(s.show())
print("The stack is empty -", s.isEmpty())
