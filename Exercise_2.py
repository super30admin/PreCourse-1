class Node():
	def __init__(self, data):
		self.data = data
		self.next = None

class Stack():
	def __init__(self):
		self.head = None

	def push(self, data): 
		new_node = Node(data)
		new_node.next = self.head
		self.head = new_node

	def pop(self):
		if (self.head == None):
			return False
		else:
			value = self.head.data
			self.head = self.head.next
			return value

	def peek(self):
		if (self.head == None):
			return False
		else:
			value = self.head.data
			return value

	def isEmpty(self):
		if (self.head == None):
			print("Stack is empty")
			return True
		else:
			print("Stack is not empty")
			return False



''' Driver Code '''

print("\n\nStack using Linked List\n")
s = Stack()

s.isEmpty()
s.push(150)
s.push(250)
print("Top element in the stack is: " + str(s.peek()))
s.push(350)
s.isEmpty()
s.push(450)
print("Popped out " + str(s.pop()))
print("Top element in the stack is: " + str(s.peek()))
print("\n\nEnd of testing\n")
