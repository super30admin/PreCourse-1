class Stack():

	def __init__(self):
		self.item = []

	def push(self, data):
		self.item.append(data)

	def pop(self):
		if len(self.item) == 0:
			print ("List is empty cannot pop")
		else:
			return self.item.pop()

	def isEmpty(self):
		if len(self.item) == 0:
			print("Stack is empty")
			return True
		else:
			print("Stack is not empty")
			return False

	def peek(self):
		return self.item[-1]

	def length(self):
		return print("Length is: " + str(len(self.item)))

	def printStack(self):
		print("\nThe List is:")
		for i in range(len(self.item)):
			print(self.item[i])
		print("list is over\n")


''' Driver Code '''

print("\n\nStack using Array (List)\n")
my_stack = Stack()
my_stack.isEmpty()

my_stack.push(5)
my_stack.push(10)

print("Top element in the stack is: " + str(my_stack.peek()))
my_stack.length()
print("Popped out " + str(my_stack.pop()))
my_stack.printStack()

my_stack.push(15)
my_stack.push(20)
my_stack.printStack()

my_stack.length()
my_stack.pop()
my_stack.printStack()

