class Stack():

	def __init__(self):
		self.item = []

	def push(self, data):
		self.item.append(data)

	def pop(self):
		if len(self.item) == 0:
			print ("List is empty cannot pop")
		else:
			return print(self.item.pop())

	def isEmpty(self):
		if len(self.item) == 0:
			print("Stack is empty")
			return True
		else:
			print("Stack is not empty")
			return False

	def peek(self):
		return print("First element in the stack is: " + str(self.item[-1]))

	def length(self):
		return print("Length is: " + str(len(self.item)))


print("Stack using Array (List)")
my_stack = Stack()
my_stack.isEmpty()
my_stack.pop()

my_stack.push(10)
my_stack.push(20)

my_stack.peek()
my_stack.length()
my_stack.pop()

my_stack.push(30)
my_stack.push(40)

my_stack.length()
my_stack.pop()