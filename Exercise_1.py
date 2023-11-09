
# // Any problem you faced while coding this : No Issues Faced
#

# // Your code here along with comments explaining your approach
# // Time Complexity : 0(n) // it's traversing whole stack for pop and push
# // Space Complexity : 0(n) // stack space

class myStack:
	# it's like a main function of the class from where class started
	# max size of array is size
	# initializing empty stack and size 
	def __init__(self, maxsize=1000):
		self.stack = []
		self.maxsize = maxsize

	def isEmpty(self):
		return len(self.stack) <= 0

	# Here we have to push the item into the stack(list)
	# condition if the stack reaches the limit of given size then raise exception or we cab return as well
	# if not then push the item into stack(list)
	def push(self, item):
		if len(self.stack) >= self.maxsize:
			raise Exception('Stack overflow')
		else:
			self.stack.append(item)

	# if the stack is empty and there is nothing to pop then raise the exception 
	# else pop the value when pop is called
	# if not then push the item into stack(list)
	def pop(self):
		if len(self.stack) <= 0:
			raise Exception('Stack underflow')
		else:
			return self.stack.pop()

	# peek is the end value or last value in the stacl(list) 
	# if the stack is in underflow state then raie exception 
	# else similar to pop
	def peek(self):
		if len(self.stack) <= 0:
			raise Exception('Stack underflow')
		else:
			self.stack[-1]


	#show the value of stack
	def show(self):
		return self.stack


# mystack is a class and s is the object 
s = myStack()
# calling push function
s.push('1') 
s.push('2')
s.push('3')
print(s.pop())
print(s.show())






